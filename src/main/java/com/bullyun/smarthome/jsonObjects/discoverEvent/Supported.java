package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/17.
 */
@Data
public class Supported {
    private String name;

    public Supported(String name) {
        this.name = name;
    }
}
