package com.designpattern1.mediator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:14
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
