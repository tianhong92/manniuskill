package com.bullyun.smarthome.jsonObjects.discoverEvent;

public class CameraStreamConfiguration {
    private String[] protocols;
    private Resolution[] resolutions;
    private String[] authorizationTypes;
    private String[] videoCodecs;
    private String[] audioCodecs;

    public CameraStreamConfiguration() {
        this.protocols = new String[]{"RTSP"};
        this.authorizationTypes = new String[]{"BASIC"};
        this.videoCodecs = new String[]{"H264", "MPEG2"};
        this.audioCodecs = new String[]{"G711"};
    }
}
