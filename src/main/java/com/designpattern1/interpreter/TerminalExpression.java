package com.designpattern1.interpreter;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午4:15
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}