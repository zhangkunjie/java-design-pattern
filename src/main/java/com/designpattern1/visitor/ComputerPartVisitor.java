package com.designpattern1.visitor;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午7:21
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
