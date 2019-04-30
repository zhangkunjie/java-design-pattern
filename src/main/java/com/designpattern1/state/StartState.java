package com.designpattern1.state;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:05
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start States";
    }
}
