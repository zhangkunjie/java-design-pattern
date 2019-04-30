package com.designpattern1.chain;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午3:27
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
