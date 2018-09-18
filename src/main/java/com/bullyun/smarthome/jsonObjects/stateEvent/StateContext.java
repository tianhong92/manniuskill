package com.bullyun.smarthome.jsonObjects.stateEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/18.
 */
@Data
public class StateContext {
    private StateContextBody context;
    private StateEvent event;
}
