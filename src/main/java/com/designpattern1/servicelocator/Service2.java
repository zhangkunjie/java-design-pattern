package com.designpattern1.servicelocator;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:38
 */
public class Service2 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}