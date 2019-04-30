package com.designpattern1.state;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:04
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
