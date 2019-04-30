package com.designpattern2.prototype.prototype1;

//2.����ģ�ͣ�Concrete Prototype��
public class Cubic implements Prototype, Cloneable{
      double  length,width,height;
      Cubic(double a,double b,double c){
            length=a;
            width=b;
            height=c;
      }
      //ǳ�ȸ���ģʽ
      public Object cloneMe() throws CloneNotSupportedException{
            Cubic object=(Cubic)clone();  //���ô�Object��̳е�clone()����
            return object;
      } 
}
