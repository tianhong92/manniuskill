package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class PlayVideoIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("PlayVideoIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String deviceId = input.getRequestEnvelope().getContext().getSystem().getDevice().getDeviceId();
        return input.getResponseBuilder()
                .withSpeech("The device id is "+deviceId)
                .withSimpleCard("Divice Id: ", deviceId)
                .build();
    }
}
