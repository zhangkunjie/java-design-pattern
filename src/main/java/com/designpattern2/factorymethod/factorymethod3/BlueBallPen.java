package com.designpattern2.factorymethod.factorymethod3;
//��ɫɫԲ��ʵ�������
public class BlueBallPen extends BallPen{
    public PenCore getPenCore(){
       return new BluePenCore();
    }
}
