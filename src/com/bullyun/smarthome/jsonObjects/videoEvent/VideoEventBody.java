package com.bullyun.smarthome.jsonObjects.videoEvent;

import lombok.Data;

@Data
public class VideoEventBody {
    private VideoHeader header;
    private VideoEndPoint endpoint;
    private VideoPayloadBody payload;
}
