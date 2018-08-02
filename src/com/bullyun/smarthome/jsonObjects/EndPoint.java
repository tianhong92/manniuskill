package com.bullyun.smarthome.jsonObjects;

public class EndPoint {
    private String namespace;
    private String name;
    private String payloadVersion;

    public EndPoint(String namespace, String name, String payloadVersion) {
        this.namespace = namespace;
        this.name = name;
        this.payloadVersion = payloadVersion;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayloadVersion() {
        return payloadVersion;
    }

    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }
}
