package com.designpattern2.factorymethod.factorymethod2;

public class Application{
    public static void main(String args[]){
       PenCore penCore;
       BallPen ballPen=new BlueBallPen();
       penCore=ballPen.getPenCore();
       penCore.writeWord("���,�ܸ�����ʶ��");
       ballPen=new RedBallPen();
       penCore=ballPen.getPenCore();
       penCore.writeWord("How are you");
       ballPen=new BlackBallPen();
       penCore=ballPen.getPenCore();
       penCore.writeWord("nice to meet you");
    }
}
