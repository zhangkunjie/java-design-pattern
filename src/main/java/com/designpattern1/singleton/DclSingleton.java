package com.designpattern1.singleton;

/**
 * @Author: kunjie.zhang
 * @Description:这种方式采用双锁机制，安全且在多线程情况下能保持高性能。 getInstance() 的性能对应用程序很关键。
 * @Date: Created in 2018/6/4  下午11:10
 * @Modified By:
 */
public class DclSingleton {
    private static DclSingleton instance = null;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (null == instance) {
            synchronized (DclSingleton.class) {
                if (null == instance) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
