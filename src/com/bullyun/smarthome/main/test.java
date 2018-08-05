package com.bullyun.smarthome.main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.discoverEvent.*;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDeviceList;
import com.bullyun.smarthome.testData.TestData;
import com.bullyun.smarthome.util.HttpClient;

public class test {
    public static void main(String[] args) {
        String testUrl = "http://120.27.148.199:10210/api/v1/devices?app_key=8Wa227sQ00S33p4y&app_secret=RlA8aCPlsuATT227kKTg003ncP35HYRI&access_token=u_a015d16936264275a4081f345bf7f5c3";

        String response = HttpClient.doGet(testUrl);

        JSONObject json = JSON.parseObject(response);
        ManniuDeviceList list = json.toJavaObject(ManniuDeviceList.class);
        System.out.println(list.getDevices().length);


    }
}
