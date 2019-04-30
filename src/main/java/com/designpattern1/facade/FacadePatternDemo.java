package com.designpattern1.facade;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午2:38
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
