package com.bullyun.smarthome;
import com.bullyun.smarthome.testData.TestData;
import com.amazon.ask.util.JacksonSerializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class ManniuStreamHandler implements RequestStreamHandler {
    private final JacksonSerializer serializer = new JacksonSerializer();;

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String request = IOUtils.toString(inputStream);
        String respones = TestData.discoveryResponseContent();

//        LambdaLogger logger = context.getLogger();
//        logger.log("Get request12:");
//        logger.log(request);
//        logger.log("Get respones12");
//        logger.log(respones);
//        logger.log("end logger12!");

        byte[] response = respones.getBytes("utf-8");
        outputStream.write(response);
    }
}