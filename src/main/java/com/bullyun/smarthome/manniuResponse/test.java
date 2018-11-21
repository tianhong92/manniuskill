package com.bullyun.smarthome.manniuResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.util.HttpClient;
import com.bullyun.smarthome.util.SignUtils;

import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/19
 * @Description
 */
public class test {
    private static final String url = "http://121.40.248.246/RTMPLiveServer/LiveUrlServlet";
    private static final String devName = "MDAhAQEAbGUwNjFiMjRjMDA4NwAA";
    private static final String comInfo = "0";
    private static final String channelID = "0";
    private static final String streamID = "0";
    private static final String type = "0";


    public static void main(String[] args) {
        //String url = "http://121.40.248.246/RTMPLiveServer/LiveUrlServlet?devName=devName&comInfo=comInfo&channelID=channelID&streamID=streamID&type=type&sign=sign";

        HashMap<String, String> map = new HashMap<>();
        map.put("devName", "MDAhAQEAbGUwNjFiMjRjMDA4NwAA");
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

        String rtspUrl = String.format("%s?devName=%s&comInfo=%s&channelID=%s&streamID=%s&type=%s&sign=%s", url, devName, comInfo, channelID, streamID, type, sign);

        System.out.println(rtspUrl);
        String response = HttpClient.doGet(rtspUrl);
        JSONObject json = JSON.parseObject(response);
        System.out.println(json);
        System.out.println(json.get("rtspUrl"));
//        JSONObject tempo = json.getJSONObject("rtspUrl");
//        System.out.println(tempo);
    }
}