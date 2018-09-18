package com.bullyun.smarthome.jsonObjects.videoEvent;

import lombok.Data;

@Data
public class VideoPayloadBody {
    private CameraStream[] cameraStreams;
    private String imageUri;

    public VideoPayloadBody(String imageUri) {
        this.imageUri = imageUri;
    }
}
