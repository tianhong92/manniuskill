package com.bullyun.smarthome.main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.testData.TestData;

public class test {
    public static void main(String[] args) {
        JSONObject jsonObject = JSON.parseObject(TestData.getLaunchRequestContent());
        System.out.println(TestData.getLaunchRequestContent());
        System.out.println(jsonObject.get("version"));
    }
}
