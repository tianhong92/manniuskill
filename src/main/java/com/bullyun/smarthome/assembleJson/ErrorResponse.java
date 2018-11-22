package com.bullyun.smarthome.assembleJson;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.errorEvent.*;

/**
 * @Author: TianhongWang
 * @Date: 2018/11/22
 * @Description
 */
public class ErrorResponse {
    public static String getResponse(String correlationToken, String errorMsg, String endPoint){
        ErrorEvent event = new ErrorEvent();
        ErrorEventBody eventBody = new ErrorEventBody();
        ErrorHeader header = new ErrorHeader(correlationToken);
        ErrorEndPoint errorEndPoint = new ErrorEndPoint(endPoint);
        ErrorPayloadBody payload = new ErrorPayloadBody(errorMsg);

        event.setEvent(eventBody);
        eventBody.setHeader(header);
        eventBody.setEndpoint(errorEndPoint);
        eventBody.setPayload(payload);

        Object eventJson = JSONObject.toJSON(event);
        return eventJson.toString();
    }
}
