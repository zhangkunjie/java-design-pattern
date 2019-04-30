package com.designpattern1.observer;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:54
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}