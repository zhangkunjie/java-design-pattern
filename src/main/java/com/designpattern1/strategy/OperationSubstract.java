package com.designpattern1.strategy;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午6:13
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}