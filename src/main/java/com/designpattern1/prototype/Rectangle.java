package com.designpattern1.prototype;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018年06月05日 上午10:04
 * @modified By:
 */
public class Rectangle extends Shape {


    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
