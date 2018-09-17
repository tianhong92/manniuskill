package com.bullyun.smarthome.manniuResponse;

public class CameraStream {
    public static String getSteamUrl(String token, String endPoint) {
        return "rtsp://admin:123456@alexa.bullyun.com:443/H264?&tls&ch=1&subtype=0&Onvif";
    }
}
