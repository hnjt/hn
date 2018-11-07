package com.hn.hn_pojo.Entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息 of date 2018-11-06 by chenyb
 */
@Data
public class UserVO implements Serializable {


    //uuid
    private String uuid;
    //用户名
    private String userName;
    //登录密码
    private String passWord;
    //电话
    private String iphone;
    //身份证号
    private String card;
    //真实姓名
    private String rName;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "uuid='" + uuid + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", iphone='" + iphone + '\'' +
                ", card='" + card + '\'' +
                ", rName='" + rName + '\'' +
                '}';
    }
}
