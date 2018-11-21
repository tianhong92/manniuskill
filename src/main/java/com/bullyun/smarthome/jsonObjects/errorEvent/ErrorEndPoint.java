package com.bullyun.smarthome.jsonObjects.errorEvent;

import lombok.Data;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/21
 * @Description
 */
@Data
public class ErrorEndPoint {
    private String endpointId;

    public ErrorEndPoint(String endpointId) {
        this.endpointId = endpointId;
    }
}
