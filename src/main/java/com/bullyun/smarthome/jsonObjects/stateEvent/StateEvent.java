package com.bullyun.smarthome.jsonObjects.stateEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/18.
 */
@Data
public class StateEvent {
    private StateHeader header;
    private StateEndpoint endpoint;
    private StatePayload payload;
}
