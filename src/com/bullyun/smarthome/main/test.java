package com.bullyun.smarthome.main;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.EndPoint;

public class test {
    public static void main(String[] args) {
        EndPoint endPoint = new EndPoint("SPACE", "name", "version");
        Object json = JSONObject.toJSON(endPoint);
        JSONObject obj = new JSONObject();
        obj.put("event", json);
        System.out.println(obj.toString());

    }
}
