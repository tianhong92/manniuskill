package com.bullyun.smarthome.manniuResponse;

public class CameraStream {
    public static String getSteamUrl(String token, String endPoint) {
        return "rtsp://192.168.1.106/H264?ch=1&subtype=0";
    }
}
