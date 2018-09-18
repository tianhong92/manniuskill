package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

import java.util.UUID;

@Data
public class DiscoverHeader {
    private String namespace;
    private String name;
    private String payloadVersion;
    private String messageId;

    public DiscoverHeader() {
        this.namespace = "Alexa.Discovery";
        this.name = "Discover.Response";
        this.payloadVersion = "3";
        this.messageId = UUID.randomUUID().toString();
    }
}
