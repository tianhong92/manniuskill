package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

@Data
public class CameraStreamConfiguration {
    private String[] protocols;
    private Resolution[] resolutions;
    private String[] authorizationTypes;
    private String[] videoCodecs;
    private String[] audioCodecs;

    public CameraStreamConfiguration() {
        this.protocols = new String[]{"RTSP"};
        this.authorizationTypes = new String[]{"NONE"};
        this.videoCodecs = new String[]{"H264"};
        this.audioCodecs = new String[]{"NONE"};
    }
}
