package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

/**
 * @author pc
 * @since 2018/9/17.
 */
@Data
public class DiscoverProperty {

    private boolean proactivelyReported;
    private boolean retrievable;
    private Supported[] supported;

    public DiscoverProperty(String name) {
        retrievable = true;
        supported = new Supported[]{new Supported(name)};
    }
}
