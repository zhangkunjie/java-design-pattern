package com.designpattern1.proxy;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午3:21
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
