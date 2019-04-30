package com.designpattern2.facade.facade2;

//��ϵͳ�е�������֮һTypeSeting
public class TypeSeting{
    String advertisement;
    public TypeSeting(String advertisement){
       this.advertisement=advertisement;
    }
    public void typeSeting(){ 
       System.out.println("����Ű��ʽ:");
       System.out.println("********");
       System.out.println(advertisement);
       System.out.println("********");  
    } 
}
