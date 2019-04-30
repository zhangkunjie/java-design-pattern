package com.designpattern1.bridge;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:37
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}