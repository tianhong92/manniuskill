package com.bullyun.smarthome.jsonObjects.diviceList;

import lombok.Data;

@Data
public class ManniuDevice {
    private String id;
    private String sn;
    private String dev_name;
    private int online; //0表示不在线，1表示在线, 2 表示休眠状态
    private String model;

}
