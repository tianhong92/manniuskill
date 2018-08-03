package com.bullyun.smarthome.jsonObjects.videoEvent;

public class VideoPayloadBody {
    private CameraStream[] cameraStreams;
    private String imageUri;

    public VideoPayloadBody(String imageUri) {
        this.imageUri = imageUri;
    }
}
