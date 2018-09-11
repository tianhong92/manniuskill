package com.bullyun.smarthome.jsonObjects.videoEvent;

import com.bullyun.smarthome.jsonObjects.discoverEvent.Resolution;
import lombok.Data;

@Data
public class CameraStream {
    private String uri;
    private String protocol;
    private Resolution resolution;
    private String authorizationType;
    private String videoCodec;
    private String audioCodec;

    public CameraStream(String uri) {
        this.uri = uri;
        this.protocol = "RTSP";
        this.resolution = new Resolution(704, 576);
        this.authorizationType = "BASIC";
        this.videoCodec = "H264";
        this.audioCodec = "NONE";
    }
}
