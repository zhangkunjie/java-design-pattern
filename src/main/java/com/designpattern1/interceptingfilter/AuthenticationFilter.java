package com.designpattern1.interceptingfilter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:33
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}