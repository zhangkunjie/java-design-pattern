package com.designpattern1.abstractfactory;

/**
 * @Author: kunjie.zhang
 * @Description:
 * @Date: Created in 2018/6/4  下午5:15
 * @Modified By:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
