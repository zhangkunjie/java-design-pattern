package com.designpattern2.factorymethod.factorymethod2;
//��ɫ��о
public class BluePenCore extends PenCore{
    BluePenCore(){
      color="��ɫ";
    }
    public void writeWord(String s){
       System.out.println("д��"+color+"����:"+s);
    }
}
