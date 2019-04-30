package com.designpattern2.decorator.decorator3;

//����װ����
public class  SparrowDecorator extends Decorator{
   public final int DISTANCE=50;        //eleFly�����ܷ�50��
   SparrowDecorator(Bird bird){
      super(bird);
   }
   public int fly(){
      int distance=0;
      distance=bird.fly()+eleFly();  //ί�б�װ����bird����fly()��Ȼ���ٵ���eleFly()
      return distance; 
   }
   private int eleFly(){              //װ��������ӵķ���
      return DISTANCE;
   }
}
