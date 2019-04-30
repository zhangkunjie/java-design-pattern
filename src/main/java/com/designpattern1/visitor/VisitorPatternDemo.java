package com.designpattern1.visitor;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午7:22
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}