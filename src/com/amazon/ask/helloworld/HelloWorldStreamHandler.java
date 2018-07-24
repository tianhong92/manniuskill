package com.amazon.ask.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.builder.StandardSkillBuilder;
import com.amazon.ask.helloworld.handlers.HelloWorldIntentHandler;
import com.amazon.ask.helloworld.handlers.LaunchRequestHandler;
import com.amazon.ask.helloworld.handlers.PlayVideoIntentHandler;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.ResponseEnvelope;
import com.amazon.ask.util.JacksonSerializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HelloWorldStreamHandler implements RequestStreamHandler {
    private final Skill skill;
    private final JacksonSerializer serializer;

    public HelloWorldStreamHandler() {
        this.skill = new StandardSkillBuilder()
                .addRequestHandler(new LaunchRequestHandler())
                .addRequestHandler(new HelloWorldIntentHandler())
                .addRequestHandler(new PlayVideoIntentHandler())
                .build();
        this.serializer = new JacksonSerializer();
    }

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String request = IOUtils.toString(inputStream);
        RequestEnvelope requestEnvelope = serializer.deserialize(request, RequestEnvelope.class);
        ResponseEnvelope responseEnvelope = skill.invoke(requestEnvelope);
        byte[] response = serializer.serialize(responseEnvelope).getBytes(StandardCharsets.UTF_8);
        outputStream.write(response);
    }
}