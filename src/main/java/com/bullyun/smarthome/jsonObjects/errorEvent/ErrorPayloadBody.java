package com.bullyun.smarthome.jsonObjects.errorEvent;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/21
 * @Description
 */

public class ErrorPayloadBody {
    private String type;
    private String message;

    public ErrorPayloadBody(String message) {
        this.type = "ENDPOINT_UNREACHABLE";
        //this.message = "Please link your account again and make sure camera is on line";
        this.message = message;
    }
}
