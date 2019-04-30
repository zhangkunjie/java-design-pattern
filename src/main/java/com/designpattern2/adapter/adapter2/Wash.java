package com.designpattern2.adapter.adapter2;

public class Wash implements ThreeElectricOutlet{ //ϴ�»�ʹ���������
    String name;
    Wash(){
       name="�ƺ�ϴ�»�";
    }
    Wash(String s){
       name=s;
    }
    public void connectElectricCurrent(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"��ʼϴ���");
    }
}
