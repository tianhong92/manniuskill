package com.bullyun.smarthome.manniuResponse;

public class CameraStream {
    public static String getSteamUrl(String token, String endPoint) {
        return "rtsp://admin:123456@192.168.1.104:443/H264?ch=1&subtype=0";
    }
}
