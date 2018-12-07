package com.bullyun.smarthome.assembleJson;

import com.alibaba.fastjson.JSONObject;
import com.bullyun.smarthome.jsonObjects.videoEvent.*;

public class VideoStreamingResponse {
    public static String getResponse(String correlationToken, String endpointId, String imageUri, String videoUri) {
        VideoEvent event = new VideoEvent();
        VideoEventBody eventBody = new VideoEventBody();
        VideoHeader header = new VideoHeader(correlationToken);
        VideoEndPoint endpoint = new VideoEndPoint(endpointId);
        VideoPayloadBody payloadBody = new VideoPayloadBody(imageUri);
        CameraStream cameraStream = new CameraStream(videoUri);
        //CameraStream cameraStream = new CameraStream("rtsp://rtsp.bullyun.com:443/1aed0b4382fa46d1d29d48923b541263_680742.sdp");
        CameraStream[] cameraStreams = new CameraStream[]{cameraStream};

        event.setEvent(eventBody);
        eventBody.setHeader(header);
        eventBody.setEndpoint(endpoint);
        eventBody.setPayload(payloadBody);
        payloadBody.setCameraStreams(cameraStreams);

        Object json = JSONObject.toJSON(event);
        return json.toString();
    }
}
