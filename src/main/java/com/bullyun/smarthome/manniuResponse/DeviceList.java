package com.bullyun.smarthome.manniuResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDeviceList;
import com.bullyun.smarthome.util.HttpClient;

public class DeviceList {
    private static final String url =  "http://120.27.148.199:10210/api/v1/devices";
    private static final String app_key = "8Wa227sQ00S33p4y";
    private static final String app_secret = "RlA8aCPlsuATT227kKTg003ncP35HYRI";

//    private static final String url =  "http://rest.bullyun.com/api/v1/devices";
//    private static final String app_key = "e788da8e88d04589";
//    private static final String app_secret = "d9d58f30ebe44585a6cabc1aabb7b5e5";


    public static ManniuDeviceList getDeviceList(String access_token) {
        String manniuUrl = String.format("%s?app_key=%s&app_secret=%s&access_token=%s", url, app_key, app_secret, access_token);
        String response = HttpClient.doGet(manniuUrl);
        JSONObject json = JSON.parseObject(response);
        return json.toJavaObject(ManniuDeviceList.class);
    }

    public static Integer getDeviceState(String access_token,String deviceSn){
        String getUrl = String.format("%s/%s/online?app_key=%s&app_secret=%s&access_token=%s", url,deviceSn, app_key,
                app_secret, access_token);

        String response = HttpClient.doGet(getUrl);
        JSONObject json = JSON.parseObject(response);
        return json.getInteger("state");
    }
}
