package com.designpattern1.prototype;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018年06月05日 上午10:08
 * @modified By:
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
