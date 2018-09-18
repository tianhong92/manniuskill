package com.bullyun.smarthome.jsonObjects.discoverEvent;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DiscoverCapability {
    private String type;
    @JSONField(name = "interface")
    private String interFace;
    private String version;
    private CameraStreamConfiguration[] cameraStreamConfigurations;
    private DiscoverProperty properties;

    public DiscoverCapability(String interFace) {
        this.type = "AlexaInterface";
        this.interFace = interFace;
        this.version = "3";
    }
}
