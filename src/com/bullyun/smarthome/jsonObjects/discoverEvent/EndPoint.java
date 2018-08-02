package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

@Data
public class EndPoint {
    private String endpointId;
    private String manufacturerName;
    private String modelName;
    private String friendlyName;
    private String description;
    private String[] displayCategories;
    private DiscoverCookie cookie;
    private DiscoverCapability[] capabilities;

    // Constructor and Getter Setter

    public EndPoint(String endpointId) {
        this.endpointId = endpointId;
        this.manufacturerName = "Manniu tech";
        this.modelName = "model23";
        this.friendlyName = "Camera";
        this.description = "This is a manniu camera";
        this.displayCategories = new String[]{"CAMERA"};
        this.cookie = null;

    }
}
