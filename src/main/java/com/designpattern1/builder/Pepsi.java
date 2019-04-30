package com.designpattern1.builder;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018/6/4  下午11:56
 * @modified By:
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
