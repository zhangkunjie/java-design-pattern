package com.designpattern1.singleton;

/**
 * @Author: kunjie.zhang
 * @Description:懒汉式，线程不安全
 * @Date: Created in 2018/6/4  下午11:10
 * @Modified By:
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
