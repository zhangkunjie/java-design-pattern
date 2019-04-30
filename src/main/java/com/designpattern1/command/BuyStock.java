package com.designpattern1.command;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午4:02
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}