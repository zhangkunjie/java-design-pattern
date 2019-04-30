package com.designpattern1.template;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:26
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}