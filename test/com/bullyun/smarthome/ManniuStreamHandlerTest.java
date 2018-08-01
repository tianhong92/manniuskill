package com.bullyun.smarthome;

import com.amazonaws.util.StringInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class ManniuStreamHandlerTest {

    @Test
    public void handleRequest() {
        ManniuStreamHandler handler = new ManniuStreamHandler();
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
}