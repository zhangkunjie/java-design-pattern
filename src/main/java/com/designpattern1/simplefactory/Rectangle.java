package com.designpattern1.simplefactory;

/**
 * @Author: kunjie.zhang
 * @Description:
 * @Date: Created in 2018/6/4  下午4:06
 * @Modified By:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
