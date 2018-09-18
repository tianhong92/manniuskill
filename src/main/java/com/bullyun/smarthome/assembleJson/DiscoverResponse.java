package com.bullyun.smarthome.assembleJson;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.discoverEvent.*;
import com.bullyun.smarthome.jsonObjects.diviceList.ManniuDeviceList;
import com.bullyun.smarthome.jsonObjects.discoverEvent.DiscoverProperty;

public class DiscoverResponse {
    public static String getResponse(ManniuDeviceList list) {
        DiscoverEvent event = new DiscoverEvent();
        DiscoverEventBody eventBody = new DiscoverEventBody();
        DiscoverHeader header = new DiscoverHeader();
        DiscoverPayloadBody payload = new DiscoverPayloadBody();
        DiscoverCookie cookie = new DiscoverCookie();

        EndPoint[] endPoints = new EndPoint[list.getDevices().length];
        DiscoverCapability discoverCapability = new DiscoverCapability("Alexa.CameraStreamController");
        discoverCapability.setProperties(new DiscoverProperty("connectivity"));
        DiscoverCapability[] discoverCapabilities = new DiscoverCapability[]{discoverCapability};

        for(int i = 0; i < list.getDevices().length; i++) {
            String devName = list.getDevices()[i].getDev_name();
            String sn = list.getDevices()[i].getSn();
            EndPoint endPoint = new EndPoint(sn, devName);
            endPoint.setCapabilities(discoverCapabilities);
            endPoint.setCookie(cookie);
            endPoints[i] = endPoint;
        }

        CameraStreamConfiguration cameraStreamConfiguration = new CameraStreamConfiguration();
        CameraStreamConfiguration[] cameraStreamConfigurations = new CameraStreamConfiguration[]{cameraStreamConfiguration};
        discoverCapability.setCameraStreamConfigurations(cameraStreamConfigurations);
        Resolution resolution1 = new Resolution(1920, 1080);
        Resolution[] resolutions = new Resolution[]{ resolution1 };
        cameraStreamConfiguration.setResolutions(resolutions);


        event.setEvent(eventBody);
        eventBody.setHeader(header);
        eventBody.setPayload(payload);
        payload.setEndpoints(endPoints);

        Object eventJson = JSONObject.toJSON(event);
        return eventJson.toString();
    }
}
