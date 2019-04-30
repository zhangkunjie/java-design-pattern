package com.designpattern1.decorator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午2:09
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
