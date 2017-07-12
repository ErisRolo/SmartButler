package com.example.guohouxiao.smartbutler.entity;

/**
 * Created by guohouxiao on 2017/7/10.
 * 对话列表的实体
 */

public class ChatListData {

    //类型
    private int type;
    //文本

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
}
