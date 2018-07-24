package com.amazon.ask.helloworld;

import com.amazonaws.util.StringInputStream;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class HelloWorldStreamHandlerTest {

    @org.junit.Test
    public void handleRequest() {
        HelloWorldStreamHandler handler = new HelloWorldStreamHandler();
        try {
            StringInputStream inputStream = new StringInputStream(TestData.getRequestContent());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            handler.handleRequest(inputStream, outputStream,null);
            String response = outputStream.toString();
            Assert.assertNotNull(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}