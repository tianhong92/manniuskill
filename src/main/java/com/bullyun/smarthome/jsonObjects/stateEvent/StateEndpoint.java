package com.bullyun.smarthome.jsonObjects.stateEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/18.
 */
@Data
public class StateEndpoint {
    private String endpointId;
    private StateScope scope;
    private StateCookie cookie;
}
