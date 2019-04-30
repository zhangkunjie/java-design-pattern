package com.designpattern1.builder;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018/6/4  下午11:51
 * @modified By:
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
