package com.designpattern1.mediator;

import java.util.Date;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:14
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
