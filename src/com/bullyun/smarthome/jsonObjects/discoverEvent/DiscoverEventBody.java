package com.bullyun.smarthome.jsonObjects.discoverEvent;

import lombok.Data;

@Data
public class DiscoverEventBody {
    private DiscoverHeader header;
    private DiscoverPayloadBody payload;
}
