package com.bullyun.smarthome.assembleJson;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.stateEvent.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author pc
 * @since 2018/9/17.
 */
public class StateResponse {

    public static String getResponse(String correlationToken, String endpointId, String type, String token,
                                     Integer state) {
        StateContext stateContext = new StateContext();


        StateContextBody context = new StateContextBody();

        StateValue stateValue = new StateValue();
        if (state != null && state == 1) {
            stateValue.setValue("OK");
        } else {
            stateValue.setValue("UNREACHABLE");
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        StateProperty property = new StateProperty();
        property.setNamespace("Alexa.EndpointHealth");
        property.setName("connectivity");
        property.setValue(stateValue);
        property.setTimeOfSample(format.format(new Date()));
        property.setUncertaintyInMilliseconds(0);
        StateProperty[] properties = new StateProperty[]{property};

        StateEvent event = new StateEvent();
        StateHeader header = new StateHeader();
        header.setMessageId(UUID.randomUUID().toString());
        header.setCorrelationToken(correlationToken);
        header.setNamespace("Alexa");
        header.setName("StateReport");
        header.setPayloadVersion("3");

        StateScope scope = new StateScope();
        scope.setToken(token);
        scope.setType(type);
        StateEndpoint endpoint = new StateEndpoint();
        endpoint.setEndpointId(endpointId);
        endpoint.setScope(scope);
        endpoint.setCookie(new StateCookie());

        event.setPayload(new StatePayload());
        event.setEndpoint(endpoint);
        event.setHeader(header);

        context.setProperties(properties);

        stateContext.setContext(context);
        stateContext.setEvent(event);

        Object json = JSONObject.toJSON(stateContext);
        return json.toString();
    }
}
