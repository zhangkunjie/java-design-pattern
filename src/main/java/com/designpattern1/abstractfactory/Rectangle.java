package com.designpattern1.abstractfactory;

/**
 * @Author: kunjie.zhang
 * @Description:
 * @Date: Created in 2018/6/4  下午5:14
 * @Modified By:
 */
public class Rectangle implements  Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
