package com.designpattern1.bridge;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:35
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}