package com.bullyun.smarthome.jsonObjects.stateEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/18.
 */
@Data
public class StateProperty {
    private String namespace;
    private String name;
    private StateValue value;
    private String timeOfSample;
    private Integer uncertaintyInMilliseconds;
}
