package com.amazon.ask.helloworld;

import com.amazonaws.util.StringInputStream;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class HelloWorldStreamHandlerTest {

    @org.junit.Test
    public void LanuchIntentTest() {
        HelloWorldStreamHandler handler = new HelloWorldStreamHandler();
        try {
            StringInputStream inputStream = new StringInputStream(TestData.getLaunchRequestContent());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            handler.handleRequest(inputStream, outputStream,null);
            String response = outputStream.toString();
            Assert.assertNotNull(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @org.junit.Test
    public void DiscoveryRequestTest() {
        HelloWorldStreamHandler handler = new HelloWorldStreamHandler();
        try {
            StringInputStream inputStream = new StringInputStream(TestData.discoveryRequestContent());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            handler.handleRequest(inputStream, outputStream,null);
            String response = outputStream.toString();
            Assert.assertNotNull(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}