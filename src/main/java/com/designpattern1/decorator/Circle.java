package com.designpattern1.decorator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午2:08
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}