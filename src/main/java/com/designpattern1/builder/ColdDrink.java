package com.designpattern1.builder;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018/6/4  下午11:54
 * @modified By:
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
