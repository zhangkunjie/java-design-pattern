package com.designpattern1.strategy;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:14
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}