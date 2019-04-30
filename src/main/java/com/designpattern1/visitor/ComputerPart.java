package com.designpattern1.visitor;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午7:20
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
