package com.designpattern1.builder;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018/6/4  下午11:55
 * @modified By:
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
