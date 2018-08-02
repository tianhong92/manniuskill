package com.bullyun.smarthome;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.testData.TestData;
import com.amazon.ask.util.JacksonSerializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ManniuStreamHandler implements RequestStreamHandler {
    private final JacksonSerializer serializer = new JacksonSerializer();;

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String request = IOUtils.toString(inputStream);
        // 判断请求类型
        JSONObject jo = JSON.parseObject(request);
        System.out.println(jo);
        try {
            String requestType = jo.getJSONObject("directive").getJSONObject("header").get("name").toString();
            if(requestType.equals("Discover") || requestType.equals("ReportState")) {
                String token = jo.getJSONObject("directive").getJSONObject("payload").getJSONObject("scope").get("token").toString();
                // Get discovers from rest
            } else if (requestType.equals("InitializeCameraStreams")) {
                String correlationToken = jo.getJSONObject("directive").getJSONObject("header").get("correlationToken").toString();
                String token = jo.getJSONObject("directive").getJSONObject("endpoint").getJSONObject("scope").get("token").toString();
                String endpointId = jo.getJSONObject("directive").getJSONObject("endpoint").get("endpointId").toString();
                // Get streaming response from rest
            }
        } catch (NullPointerException e) {
            System.out.println("Parse Request: NullPointerException");
        }


//        String respones = TestData.discoveryResponseContent();
//
//        LambdaLogger logger = context.getLogger();
//        logger.log("Get request:");
//        logger.log(request);
//        logger.log("Get respones:");
//        logger.log(respones);
//        logger.log("end logger!");
//
//        byte[] response = respones.getBytes("utf-8");
//        outputStream.write(response);
    }
}