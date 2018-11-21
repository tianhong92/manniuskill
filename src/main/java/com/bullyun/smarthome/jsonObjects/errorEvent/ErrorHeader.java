package com.bullyun.smarthome.jsonObjects.errorEvent;

import lombok.Data;

import java.util.UUID;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/21
 * @Description
 */
@Data
public class ErrorHeader {
    private String namespace;
    private String name;
    private String payloadVersion;
    private String messageId;
    private String correlationToken;

    public ErrorHeader(String correlationToken) {
        this.namespace = "Alexa";
        this.name = "ErrorResponse";
        this.payloadVersion = "3";
        this.messageId = UUID.randomUUID().toString();
        this.correlationToken = correlationToken;
    }
}
