package com.designpattern1.chain;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午3:28
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}