package com.bullyun.smarthome.jsonObjects.stateEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/18.
 */
@Data
public class StateHeader {
    private String messageId;
    private String correlationToken;
    private String namespace;
    private String name;
    private String payloadVersion;
}
