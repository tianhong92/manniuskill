package com.bullyun.smarthome.main;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.discoverEvent.*;
import com.bullyun.smarthome.testData.TestData;

public class test {
    public static void main(String[] args) {
//        EndPoint endPoint = new EndPoint("SPACE", "name", "version");
//        Object json = JSONObject.toJSON(endPoint);
//        JSONObject obj = new JSONObject();
//        obj.put("event", json);
//        System.out.println(obj.toString());

        DiscoverEvent event = new DiscoverEvent();
        DiscoverEventBody eventBody = new DiscoverEventBody();
        DiscoverHeader header = new DiscoverHeader();
        DiscoverPayloadBody payload = new DiscoverPayloadBody();
        DiscoverCookie cookie = new DiscoverCookie();
        EndPoint endPoint = new EndPoint("endpoint 001");
        EndPoint[] endPoints = new EndPoint[]{ endPoint };
        DiscoverCapability discoverCapability = new DiscoverCapability("Alexa.CameraStreamController");
        DiscoverCapability[] discoverCapabilities = new DiscoverCapability[]{discoverCapability};
        endPoint.setCapabilities(discoverCapabilities);
        CameraStreamConfiguration cameraStreamConfiguration = new CameraStreamConfiguration();
        CameraStreamConfiguration[] cameraStreamConfigurations = new CameraStreamConfiguration[]{cameraStreamConfiguration};
        discoverCapability.setCameraStreamConfigurations(cameraStreamConfigurations);
        Resolution resolution1 = new Resolution(1920, 1080);
        Resolution resolution2 = new Resolution(1280, 720);
        Resolution[] resolutions = new Resolution[]{ resolution1, resolution2 };
        cameraStreamConfiguration.setResolutions(resolutions);


        event.setEvent(eventBody);
        eventBody.setHeader(header);
        eventBody.setPayload(payload);
        endPoint.setCookie(cookie);
        payload.setEndpoints(endPoints);


        Object eventJson = JSONObject.toJSON(event);
        System.out.println(eventJson.toString());
    }
}
