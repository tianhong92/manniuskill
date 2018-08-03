package com.bullyun.smarthome.jsonObjects.videoEvent;

import com.bullyun.smarthome.jsonObjects.discoverEvent.Resolution;

public class CameraStream {
    private String uri;
    private String expirationTime;
    private int idleTimeoutSeconds;
    private String protocol;
    private Resolution resolution;
    private String authorizationType;
    private String videoCodec;
    private String audioCodec;

    public CameraStream(String uri, String expirationTime) {
        this.uri = uri;
        this.expirationTime = expirationTime;
        this.idleTimeoutSeconds = 30;
        this.protocol = "RTSP";
        this.resolution = new Resolution(1920, 1080);
        this.authorizationType = "BASIC";
        this.videoCodec = "H264";
        this.audioCodec = "AAC";
    }
}
