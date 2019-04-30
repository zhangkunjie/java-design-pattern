package com.designpattern1.singleton;

/**
 * @Author: kunjie.zhang
 * @Description:饿汉式，线程安全
 * @Date: Created in 2018/6/4  下午11:10
 * @Modified By:
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
