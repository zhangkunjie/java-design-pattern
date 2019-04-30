package com.designpattern1.flyweight;

import java.util.HashMap;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午3:02
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
