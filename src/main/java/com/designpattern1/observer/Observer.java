package com.designpattern1.observer;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:36
 */
public  abstract  class Observer {
    protected Subject subject;
    public abstract void update();
}
