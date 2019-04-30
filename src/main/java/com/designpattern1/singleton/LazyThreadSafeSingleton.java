package com.designpattern1.singleton;

/**
 * @author: kunjie.zhang
 * @Description: 懒汉式，线程安全
 * @Date: Created in 2018/6/4  下午11:10
 * @Modified By:
 */
public class LazyThreadSafeSingleton {
    private static LazyThreadSafeSingleton instance;

    private LazyThreadSafeSingleton() {
    }

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (null == instance) {
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }
}
