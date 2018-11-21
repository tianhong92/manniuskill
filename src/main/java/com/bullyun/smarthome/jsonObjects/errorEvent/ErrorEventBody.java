package com.bullyun.smarthome.jsonObjects.errorEvent;

import lombok.Data;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/21
 * @Description
 */

@Data
public class ErrorEventBody {
    private ErrorHeader header;
    private ErrorEndPoint endpoint;
    private ErrorPayloadBody payload;
}
