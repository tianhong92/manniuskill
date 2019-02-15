package com.bullyun.smarthome.manniuResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.util.HttpClient;
import com.bullyun.smarthome.util.SignUtils;

import java.io.IOException;
import java.util.HashMap;

public class CameraStream {
    //private static final String url = "http://121.40.248.246/RTMPLiveServer/LiveUrlServlet";
    private static final String url = "http://54.213.3.109/RTMPTest/LiveUrlServlet";
    private static final String comInfo = "0";
    private static final String channelID = "0";
    private static final String streamID = "0";
    private static final String type = "0";

    public static String getSteamUrl(String token, String endPoint) {
        HashMap<String, String> map = new HashMap<>();
        map.put("devName", endPoint);
        map.put("comInfo", "0");
        map.put("channelID", "0");
        map.put("streamID", "0");
        map.put("type", "0");
        map.put("manniuKey", "manniuIPCKey");
        String sign = null;
        try {
            sign = SignUtils.getSignature(map);
        } catch (IOException ignored) {

        }
        String rtspUrl = String.format("%s?devName=%s&comInfo=%s&channelID=%s&streamID=%s&type=%s&sign=%s&access_token=%s", url, endPoint, comInfo, channelID, streamID, type, sign, token);
        String response = HttpClient.doGet(rtspUrl);
        return JSON.parseObject(response).get("rtspUrl").toString();
    }
}

