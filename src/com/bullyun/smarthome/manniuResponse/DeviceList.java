package com.bullyun.smarthome.manniuResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDevice;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDeviceList;
import com.bullyun.smarthome.util.HttpClient;

public class DeviceList {
    private static final String url =  "http://120.27.148.199:10210/api/v1/devices";
    private static final String app_key = "8Wa227sQ00S33p4y";
    private static final String app_secret = "RlA8aCPlsuATT227kKTg003ncP35HYRI";

    public static ManniuDeviceList getDeviceList(String access_token) {
        String testUrl = "http://120.27.148.199:10210/api/v1/devices?app_key=8Wa227sQ00S33p4y&app_secret=RlA8aCPlsuATT227kKTg003ncP35HYRI&access_token=u_ffbf3947071141c9be010cb244fa7ce2";
        String manniuUrl = String.format("%s?app_key=%s&app_secret=%s&access_token=%s", url, app_key, app_secret, access_token);
        System.out.println(manniuUrl);

        String response = HttpClient.doGet(manniuUrl);
        //System.out.println(response);
        JSONObject json = JSON.parseObject(response);
        ManniuDeviceList list = json.toJavaObject(ManniuDeviceList.class);
        return list;
    }
}
