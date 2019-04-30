package com.designpattern1.abstractfactory;

/**
 * @Author: kunjie.zhang
 * @Description:
 * @Date: Created in 2018/6/4  下午5:18
 * @Modified By:
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
