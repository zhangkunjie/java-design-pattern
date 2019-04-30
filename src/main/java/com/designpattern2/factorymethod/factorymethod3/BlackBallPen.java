package com.designpattern2.factorymethod.factorymethod3;
//��ɫԲ��ʵ�������
public class BlackBallPen extends BallPen{
    public PenCore getPenCore(){
       return new BlackPenCore();
    }
}
