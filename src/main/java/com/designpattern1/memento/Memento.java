package com.designpattern1.memento;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:26
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
