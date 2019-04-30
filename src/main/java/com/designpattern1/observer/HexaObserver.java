package com.designpattern1.observer;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:54
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}