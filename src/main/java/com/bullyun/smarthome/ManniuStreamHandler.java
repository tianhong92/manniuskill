package com.bullyun.smarthome;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;
import com.bullyun.smarthome.assembleJson.DiscoverResponse;
import com.bullyun.smarthome.assembleJson.ErrorResponse;
import com.bullyun.smarthome.assembleJson.StateResponse;
import com.bullyun.smarthome.assembleJson.VideoStreamingResponse;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDeviceList;
import com.bullyun.smarthome.manniuResponse.CameraStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.bullyun.smarthome.manniuResponse.DeviceList.getDeviceList;
import static com.bullyun.smarthome.manniuResponse.DeviceList.getDeviceState;

public class ManniuStreamHandler implements RequestStreamHandler {
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String request = IOUtils.toString(inputStream);
        // 判断请求类型
        JSONObject jo = JSON.parseObject(request);
        LambdaLogger logger = context.getLogger();
        logger.log("【收到请求】");
        logger.log(request);
        String correlationToken = null;
        String endpointId = null;

        try {
            String requestType = jo.getJSONObject("directive").getJSONObject("header").get("name").toString();
            String response = null;

            // 发现设备请求不会失败， 超时就不显示设备
            if (requestType.equals("Discover")) {
                String token = jo.getJSONObject("directive").getJSONObject("payload").getJSONObject("scope")
                        .get("token").toString();
                // Get discovers from rest
                ManniuDeviceList list = getDeviceList(token);
                response = DiscoverResponse.getResponse(list);

                logger.log("【发现设备响应】:");
                logger.log(response);

            } else if (requestType.equals("ReportState")) {
                endpointId = jo.getJSONObject("directive").getJSONObject("endpoint").get("endpointId").toString();;
                String token = jo.getJSONObject("directive").getJSONObject("endpoint").getJSONObject("scope")
                        .getString("token");
                correlationToken = jo.getJSONObject("directive").getJSONObject("header")
                        .getString("correlationToken");
                String type = jo.getJSONObject("directive").getJSONObject("endpoint").getJSONObject("scope")
                        .getString("type");
                String deviceSn = jo.getJSONObject("directive").getJSONObject("endpoint").getString("endpointId");
                Integer state = getDeviceState(token, deviceSn);
                response = StateResponse.getResponse(correlationToken, deviceSn, type, token, state);

                logger.log("【设备状态响应】:");
                logger.log(response);

            } else if (requestType.equals("InitializeCameraStreams")) {
                correlationToken = jo.getJSONObject("directive").getJSONObject("header").get("correlationToken")
                        .toString();
                String token = jo.getJSONObject("directive").getJSONObject("endpoint").getJSONObject("scope")
                        .get("token").toString();
                endpointId = jo.getJSONObject("directive").getJSONObject("endpoint")
                        .get("endpointId").toString();
                // Get streaming response from rest
                String videoUrl = CameraStream.getSteamUrl(token, endpointId);
                logger.log("【状态】");
                logger.log(videoUrl);
                String rtspUrl = JSON.parseObject(videoUrl).get("rtspUrl").toString();
                //String videoUrl = "rtsp://rtsp.bullyun.com:443/129b266930c91e44880512e929ae6d33_759458.sdp";
                response = VideoStreamingResponse.getResponse(correlationToken, endpointId,
                        "https://alexa.bullyun.com/cgi-bin/snapshot.cgi?action=Enable", rtspUrl);

                logger.log("【视频流响应】");
                logger.log(response);
            }
            byte[] byteResponse = response.getBytes("utf-8");
                outputStream.write(byteResponse);
        } catch (Exception e) {
            logger.log("【没有响应】"+ correlationToken + ", " + endpointId);
//            if(correlationToken != null && endpointId != null) {
//                String res = ErrorResponse.getResponse(correlationToken, "Please link your account again and make sure camera is on line", endpointId);
//                byte[] bytes = res.getBytes("utf-8");
//                outputStream.write(bytes);
//                logger.log(res);
//            }
        }
    }
}