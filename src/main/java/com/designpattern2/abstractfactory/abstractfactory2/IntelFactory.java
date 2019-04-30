package com.designpattern2.abstractfactory.abstractfactory2;
//Inter�Ĺ�������������Inter��ȫ����Ʒ
public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(755);
    }
    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }
}