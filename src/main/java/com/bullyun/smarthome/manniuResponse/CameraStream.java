package com.bullyun.smarthome.manniuResponse;

public class CameraStream {
    public static String getSteamUrl(String token, String endPoint) {
        // rtsp://admin:123456@alexa.bullyun.com:443/H264?&tls&ch=1&subtype=0&Onvif
        // rtsp://test.bullyun.com:443/proxyStream
        // rtsp://test.bullyun.com:443/H264?ch=1&subtype=1
        //rtsp://121.40.248.246:443/34f4ba07db930022b62530b892c3d05d_980090.sdp
        return "rtsp://video.bullyun.com:443/a5881662a0af6765a93090aaa844c59a_851784.sdp";
    }
}

