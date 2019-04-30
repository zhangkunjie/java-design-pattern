package com.designpattern1.template;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:27
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
