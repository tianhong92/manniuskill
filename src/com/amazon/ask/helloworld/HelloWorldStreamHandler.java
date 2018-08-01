package com.amazon.ask.helloworld;
import com.amazon.ask.helloworld.testData.TestData;
import com.amazon.ask.util.JacksonSerializer;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.util.IOUtils;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HelloWorldStreamHandler implements RequestStreamHandler {
    private final JacksonSerializer serializer = new JacksonSerializer();;

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String request = IOUtils.toString(inputStream);
        String respones = TestData.discoveryResponseContent();

        LambdaLogger logger = context.getLogger();
        // Write log to CloudWatch using LambdaLogger.
        logger.log("Get request11:");
        logger.log(request);
        byte[] response = respones.getBytes("utf-8");
        logger.log("Get respones11");
        logger.log(respones);
        logger.log("end logger11!");

        outputStream.write(response);
    }
}