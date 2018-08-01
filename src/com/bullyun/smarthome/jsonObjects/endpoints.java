package com.bullyun.smarthome.jsonObjects;

public class endpoints {
    private String namespace;
    private String name;
    private String payloadVersion;

    public endpoints(String namespace, String name, String payloadVersion) {
        this.namespace = namespace;
        this.name = name;
        this.payloadVersion = payloadVersion;
    }
}
