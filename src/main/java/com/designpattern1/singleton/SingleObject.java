package com.designpattern1.singleton;

/**
 * @Author: kunjie.zhang
 * @Description:饿汉式常用方法
 * @Date: Created in 2018/6/4  下午11:05
 * @Modified By:
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello word!");
    }


}
