package com.designpattern1.frontcontroller;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:20
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
