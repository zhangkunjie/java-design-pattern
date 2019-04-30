package com.designpattern1.chain;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午3:26
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
