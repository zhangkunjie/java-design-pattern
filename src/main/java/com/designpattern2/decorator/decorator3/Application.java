package com.designpattern2.decorator.decorator3;

//ģʽ��ʹ��
public class Application{
   public void needBird(Bird bird){
       int flyDistance=bird.fly();
       System.out.println("��ֻ���ܷ���"+flyDistance+"��");  
   }
   public static void main(String args[]){
      Application client=new Application();    
      Sparrow sparrow=new Sparrow();            
      SparrowDecorator sparrowDecorator1=
      new SparrowDecorator(sparrow);            
      SparrowDecorator sparrowDecorator2=
      new SparrowDecorator(sparrowDecorator1);  
      client.needBird(sparrowDecorator1); 
      client.needBird(sparrowDecorator2);                
  }
}
