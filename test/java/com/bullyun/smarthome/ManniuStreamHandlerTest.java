package com.bullyun.smarthome;

import com.amazonaws.util.StringInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class ManniuStreamHandlerTest {

    private static final String url =  "http://54.245.190.187:10210/api/v1/devices";
    private static final String app_key = "e788da8e88d04589";
    private static final String app_secret = "d9d58f30ebe44585a6cabc1aabb7b5e5";

    @Test
    public void handleRequest() {
        ManniuStreamHandler handler = new ManniuStreamHandler();
        try {
            StringInputStream inputStream = new StringInputStream(TestData.getStateReportRequest());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            handler.handleRequest(inputStream, outputStream, null);
            String response = outputStream.toString();
            Assert.assertNotNull(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}