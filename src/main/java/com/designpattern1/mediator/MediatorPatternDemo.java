package com.designpattern1.mediator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:15
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
