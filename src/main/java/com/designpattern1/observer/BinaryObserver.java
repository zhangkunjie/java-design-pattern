package com.designpattern1.observer;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:48
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}