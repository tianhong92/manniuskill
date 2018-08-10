package com.bullyun.smarthome.jsonObjects.diviceList;

import lombok.Data;

@Data
public class ManniuDeviceList {
    private String msg;
    private int code;
    private ManniuDevice[] devices;
}
