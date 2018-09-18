package com.bullyun.smarthome.jsonObjects.videoEvent;

import lombok.Data;

@Data
public class VideoEndPoint {
    private String endpointId;

    public VideoEndPoint(String endpointId) {
        this.endpointId = endpointId;
    }
}
