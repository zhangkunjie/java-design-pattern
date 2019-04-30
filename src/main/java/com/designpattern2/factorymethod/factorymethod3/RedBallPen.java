package com.designpattern2.factorymethod.factorymethod3;
//��ɫԲ��ʵ�������
public class RedBallPen extends BallPen{
    public PenCore getPenCore(){
       return new RedPenCore();
    }
}
