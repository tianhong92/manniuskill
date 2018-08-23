package com.bullyun.smarthome.manniuResponse;

public class CameraStream {
    public static String getSteamUrl(String token, String endPoint) {
        return "rtsp://admin:KLRAPR@192.168.1.104/h264/ch1/main/av_stream";
    }
}
