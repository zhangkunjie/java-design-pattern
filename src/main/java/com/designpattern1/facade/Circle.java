package com.designpattern1.facade;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午2:38
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}