package com.designpattern2.factorymethod.factorymethod2;
//��ɫ��о
public class BlackPenCore extends PenCore{
    BlackPenCore(){
      color="��ɫ";
    }
    public void writeWord(String s){
       System.out.println("д��"+color+"����:"+s);
    }
}
