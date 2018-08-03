package com.bullyun.smarthome.jsonObjects.videoEvent;

import java.util.UUID;

public class VideoHeader {
    private String namespace;
    private String name;
    private String payloadVersion;
    private String messageId;
    private String correlationToken;

    public VideoHeader(String correlationToken) {
        this.namespace = "Alexa.CameraStreamController";
        this.name = "Response";
        this.payloadVersion = "3";
        this.messageId = UUID.randomUUID().toString();
        this.correlationToken = correlationToken;
    }
}
