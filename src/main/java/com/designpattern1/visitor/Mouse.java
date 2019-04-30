package com.designpattern1.visitor;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午7:22
 */
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}