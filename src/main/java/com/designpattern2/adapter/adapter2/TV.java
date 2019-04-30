package com.designpattern2.adapter.adapter2;

public class TV implements TwoElectricOutlet{    //���ӻ�ʹ���������
    String name;
    TV(){
       name="�������ӻ�";
    }
    TV(String s){
       name=s;
    }
    public void connectElectricCurrent(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"��ʼ���Ž�Ŀ��");
    }
}
