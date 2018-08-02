package com.bullyun.smarthome.testData;

public class TestData {
    public static String getLaunchRequestContent() {
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

    public static String discoveryRequestContent() {
        return "{\n" +
                "  \"directive\": {\n" +
                "    \"header\": {\n" +
                "      \"namespace\": \"Alexa.Discovery\",\n" +
                "      \"name\": \"Discover\",\n" +
                "      \"payloadVersion\": \"3\",\n" +
                "      \"messageId\": \"abc-123-def-456\"\n" +
                "    },\n" +
                "    \"payload\": {\n" +
                "      \"scope\": {\n" +
                "        \"type\": \"BearerToken\",\n" +
                "        \"token\": \"access-token-from-skill\"\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    public static String discoveryResponseContent() {
        return "{\n" +
                "    \"event\": {\n" +
                "        \"header\": {\n" +
                "            \"messageId\": \"08fcc74b-4ae8-49d4-97df-1614ae5155a1\",\n" +
                "            \"name\": \"Discover.Response\",\n" +
                "            \"namespace\": \"Alexa.Discovery\",\n" +
                "            \"payloadVersion\": \"3\"\n" +
                "        },\n" +
                "        \"payload\": {\n" +
                "            \"endpoints\": [\n" +
                "                {\n" +
                "                    \"capabilities\": [\n" +
                "                        {\n" +
                "                            \"interface\": \"Alexa.PowerController\",\n" +
                "                            \"properties\": {\n" +
                "                                \"proactivelyReported\": true,\n" +
                "                                \"retrievable\": true,\n" +
                "                                \"supported\": [\n" +
                "                                    {\n" +
                "                                        \"name\": \"powerState\"\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"interface\": \"Alexa.EndpointHealth\",\n" +
                "                            \"properties\": {\n" +
                "                                \"proactivelyReported\": true,\n" +
                "                                \"retrievable\": true,\n" +
                "                                \"supported\": [\n" +
                "                                    {\n" +
                "                                        \"name\": \"connectivity\"\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"interface\": \"Alexa\",\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"cookie\": {\n" +
                "                        \"detail1\": \"For simplicity, this is the only appliance\",\n" +
                "                        \"detail2\": \"that has some values in the additionalApplianceDetails\"\n" +
                "                    },\n" +
                "                    \"description\": \"001 Switch that can only be turned on/off\",\n" +
                "                    \"displayCategories\": [\n" +
                "                        \"SWITCH\"\n" +
                "                    ],\n" +
                "                    \"endpointId\": \"endpoint-001\",\n" +
                "                    \"friendlyName\": \"Switch\",\n" +
                "                    \"manufacturerName\": \"Sample Manufacturer\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"capabilities\": [\n" +
                "                        {\n" +
                "                            \"cameraStreamConfigurations\": [\n" +
                "                                {\n" +
                "                                    \"audioCodecs\": [\n" +
                "                                        \"AAC\"\n" +
                "                                    ],\n" +
                "                                    \"authorizationTypes\": [\n" +
                "                                        \"NONE\"\n" +
                "                                    ],\n" +
                "                                    \"protocols\": [\n" +
                "                                        \"RTSP\"\n" +
                "                                    ],\n" +
                "                                    \"resolutions\": [\n" +
                "                                        {\n" +
                "                                            \"height\": 720,\n" +
                "                                            \"width\": 1280\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"videoCodecs\": [\n" +
                "                                        \"H264\"\n" +
                "                                    ]\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"interface\": \"Alexa.CameraStreamController\",\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"interface\": \"Alexa.EndpointHealth\",\n" +
                "                            \"properties\": {\n" +
                "                                \"proactivelyReported\": true,\n" +
                "                                \"retrievable\": true,\n" +
                "                                \"supported\": [\n" +
                "                                    {\n" +
                "                                        \"name\": \"connectivity\"\n" +
                "                                    }\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"interface\": \"Alexa\",\n" +
                "                            \"type\": \"AlexaInterface\",\n" +
                "                            \"version\": \"3\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"cookie\": {},\n" +
                "                    \"description\": \"008 Camera that streams from an RSTP source\",\n" +
                "                    \"displayCategories\": [\n" +
                "                        \"CAMERA\"\n" +
                "                    ],\n" +
                "                    \"endpointId\": \"endpoint-008\",\n" +
                "                    \"friendlyName\": \"Baby Camera\",\n" +
                "                    \"manufacturerName\": \"Sample Manufacturer\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }




}
