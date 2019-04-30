package com.designpattern1.bridge;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:36
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
