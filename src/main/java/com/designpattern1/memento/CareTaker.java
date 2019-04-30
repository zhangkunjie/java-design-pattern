package com.designpattern1.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午5:27
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
