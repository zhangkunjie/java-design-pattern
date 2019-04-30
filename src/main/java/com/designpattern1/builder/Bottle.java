package com.designpattern1.builder;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018/6/4  下午11:53
 * @modified By:
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
