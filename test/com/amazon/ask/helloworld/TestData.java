package com.amazon.ask.helloworld;

public class TestData {
    public static String getRequestContent() {
        return "{\n" +
                "\t\"version\": \"1.0\",\n" +
                "\t\"session\": {\n" +
                "\t\t\"new\": true,\n" +
                "\t\t\"sessionId\": \"amzn1.echo-api.session.9241a9f4-5380-4d58-8bdf-06f787b8b87a\",\n" +
                "\t\t\"application\": {\n" +
                "\t\t\t\"applicationId\": \"amzn1.ask.skill.d5d0e2b9-82e4-4f63-86d0-1c888dba36a2\"\n" +
                "\t\t},\n" +
                "\t\t\"user\": {\n" +
                "\t\t\t\"userId\": \"amzn1.ask.account.AHPBTPRQIZQLA6WHW3OKIO2AMABVNXVUIYGM4AQI2OAPC3LLLYS7R2BGVI6MM4QMLRDAGBWEEZJNW62A3CNUYYJLO6AZZKTXWSKLA5MMJLLMYRR2HKNCP7FMW2H4PP3XDFSNMU5M6ID7E35SL2EY2T7YSQ53YQH5YO25ERKCTBLXVXBQIVRG27KWDHVPQZAIYL3NMNLGJS25BZA\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"context\": {\n" +
                "\t\t\"System\": {\n" +
                "\t\t\t\"application\": {\n" +
                "\t\t\t\t\"applicationId\": \"amzn1.ask.skill.d5d0e2b9-82e4-4f63-86d0-1c888dba36a2\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"user\": {\n" +
                "\t\t\t\t\"userId\": \"amzn1.ask.account.AHPBTPRQIZQLA6WHW3OKIO2AMABVNXVUIYGM4AQI2OAPC3LLLYS7R2BGVI6MM4QMLRDAGBWEEZJNW62A3CNUYYJLO6AZZKTXWSKLA5MMJLLMYRR2HKNCP7FMW2H4PP3XDFSNMU5M6ID7E35SL2EY2T7YSQ53YQH5YO25ERKCTBLXVXBQIVRG27KWDHVPQZAIYL3NMNLGJS25BZA\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"device\": {\n" +
                "\t\t\t\t\"deviceId\": \"amzn1.ask.device.AHEPGJUAWXCDOWQ2CKUH5TBRYI24T453DMKFDU6HUEY6DEXXWLKV4Z3ZZPB4DXZOYVWTMAHKUC7IZNWNKU27WODCZQLWV3V67EBOJNVMD2PWVTCY7IASAZOY6IBHZLTQBKFDYZYPIRXVX2CTSHVOSAZACTOA\",\n" +
                "\t\t\t\t\"supportedInterfaces\": {}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"apiEndpoint\": \"https://api.amazonalexa.com\",\n" +
                "\t\t\t\"apiAccessToken\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjEifQ.eyJhdWQiOiJodHRwczovL2FwaS5hbWF6b25hbGV4YS5jb20iLCJpc3MiOiJBbGV4YVNraWxsS2l0Iiwic3ViIjoiYW16bjEuYXNrLnNraWxsLmQ1ZDBlMmI5LTgyZTQtNGY2My04NmQwLTFjODg4ZGJhMzZhMiIsImV4cCI6MTUzMjQyMzAzMiwiaWF0IjoxNTMyNDE5NDMyLCJuYmYiOjE1MzI0MTk0MzIsInByaXZhdGVDbGFpbXMiOnsiY29uc2VudFRva2VuIjpudWxsLCJkZXZpY2VJZCI6ImFtem4xLmFzay5kZXZpY2UuQUhFUEdKVUFXWENET1dRMkNLVUg1VEJSWUkyNFQ0NTNETUtGRFU2SFVFWTZERVhYV0xLVjRaM1paUEI0RFhaT1lWV1RNQUhLVUM3SVpOV05LVTI3V09EQ1pRTFdWM1Y2N0VCT0pOVk1EMlBXVlRDWTdJQVNBWk9ZNklCSFpMVFFCS0ZEWVpZUElSWFZYMkNUU0hWT1NBWkFDVE9BIiwidXNlcklkIjoiYW16bjEuYXNrLmFjY291bnQuQUhQQlRQUlFJWlFMQTZXSFczT0tJTzJBTUFCVk5YVlVJWUdNNEFRSTJPQVBDM0xMTFlTN1IyQkdWSTZNTTRRTUxSREFHQldFRVpKTlc2MkEzQ05VWVlKTE82QVpaS1RYV1NLTEE1TU1KTExNWVJSMkhLTkNQN0ZNVzJINFBQM1hERlNOTVU1TTZJRDdFMzVTTDJFWTJUN1lTUTUzWVFINVlPMjVFUktDVEJMWFZYQlFJVlJHMjdLV0RIVlBRWkFJWUwzTk1OTEdKUzI1QlpBIn19.NVaV-gnTT9YcG8qtr7dHm12kYLHS9c6stZin7fl8T4MtqgLAiTulGLrb6o2QejJwI5hMk_wk8MdFKwbwzaiFsnpzEoSL9FMQ81A1QG3QLOE5uQ8A261ZOL9tvV7r-lQ667N8U9JMZ02Yg6Nc3u3srRe5Q_5VTs5_OUjCTmLKdoaSG2GWX8RQ0TX9O28xL1UFcgdYK8ujRm1C7OtvAq65Ob6kxED4B4t2iNrx6tp2HE-5bqU4QCvXeJROoYeVirPiyb5SbMn8KaiD-uQvAx-5ZvX99fPxjLEaiT2fDRPKbFOiAY3P8ToRJiFLl6mZH-PmuV7kMJyVVjCY6FfOMl-Oow\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"request\": {\n" +
                "\t\t\"type\": \"LaunchRequest\",\n" +
                "\t\t\"requestId\": \"amzn1.echo-api.request.3adf661e-1737-4585-b142-3f73ff8c08e5\",\n" +
                "\t\t\"timestamp\": \"2018-07-24T08:03:52Z\",\n" +
                "\t\t\"locale\": \"en-US\",\n" +
                "\t\t\"shouldLinkResultBeReturned\": false\n" +
                "\t}\n" +
                "}";
    }
}