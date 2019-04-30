package com.designpattern1.facade;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午2:37
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}