package com.designpattern1.interceptingfilter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:34
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}