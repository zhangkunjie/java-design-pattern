package com.designpattern2.decorator.decorator3;

//װ����
public abstract class  Decorator extends Bird{
    protected Bird bird;//���桰��װ���ߡ�������
    public Decorator(){
    }
    public Decorator(Bird bird){
       this.bird=bird; 
    }
}
