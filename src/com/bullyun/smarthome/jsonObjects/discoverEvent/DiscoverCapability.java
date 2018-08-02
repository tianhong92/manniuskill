package com.bullyun.smarthome.jsonObjects.discoverEvent;

import com.fasterxml.jackson.annotation.JsonAlias;

public class DiscoverCapability {
    private String type;
    @JsonAlias("interface")
    private String interFace;
    private String version;
    private CameraStreamConfiguration[] cameraStreamConfigurations;

}
