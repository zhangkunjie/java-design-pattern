package com.designpattern1.bridge;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 上午11:38
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
