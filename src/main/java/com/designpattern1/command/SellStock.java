package com.designpattern1.command;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午4:03
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}