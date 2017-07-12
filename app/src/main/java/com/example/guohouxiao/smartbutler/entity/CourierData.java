package com.example.guohouxiao.smartbutler.entity;

/**
 * Created by guohouxiao on 2017/7/9.
 * 快递查询实体
 */

public class CourierData {

    //时间
    private String remark;
    //状态
    private String datetime;
    //城市
    private String zone;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "CourierData{" +
                "remark='" + remark + '\'' +
                ", datetime='" + datetime + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}
