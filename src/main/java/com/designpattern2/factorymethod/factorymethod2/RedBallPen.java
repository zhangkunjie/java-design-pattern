package com.designpattern2.factorymethod.factorymethod2;
//��ɫԲ��ʵ�������
public class RedBallPen extends BallPen{
    public PenCore getPenCore(){
       return new RedPenCore();
    }
}
