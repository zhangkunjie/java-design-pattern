package com.designpattern1.interpreter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午4:15
 */
public interface Expression {
    public boolean interpret(String context);
}
