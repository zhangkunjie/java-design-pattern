package com.designpattern2.factorymethod.factorymethod3;
//����Բ�����ĸ���
public abstract class BallPen{
    BallPen(){
       System.out.println("������һֻװ��"+getPenCore().color+"��о��Բ���");
    }
    public abstract PenCore getPenCore(); //��������
}
