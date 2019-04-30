package com.designpattern1.prototype;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018年06月05日 上午10:11
 * @modified By:
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
