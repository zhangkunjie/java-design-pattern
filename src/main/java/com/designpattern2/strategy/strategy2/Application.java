package com.designpattern2.strategy.strategy2;
//ģʽ��ʹ��
public class Application{
   public static void main(String args[]){
     GymnasticsGame game=new GymnasticsGame();  //�����Ķ���
     game.setStrategy(new StrategyOne());       //�����Ķ���ʹ�ò���һ
     Person zhang=new Person();
     zhang.setName("����");
     double [] a={9.12,9.25,8.87,9.99,6.99,7.88};
     Person li=new Person();
     li.setName("����");
     double [] b={9.15,9.26,8.97,9.89,6.97,7.89};   
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("ʹ������ƽ��ֵ����:");
     System.out.printf("%s���÷�:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s���÷�:%5.3f%n",li.getName(),li.getScore());
     game.setStrategy(new StrategyTwo());   //�����Ķ���ʹ�ò��Զ�
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("ʹ�ü���ƽ��ֵ����:");
     System.out.printf("%s���÷�:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s���÷�:%5.3f%n",li.getName(),li.getScore());  
     game.setStrategy(new StrategyThree());   //�����Ķ���ʹ�ò�����
     zhang.setScore(game.getPersonScore(a));
     li.setScore(game.getPersonScore(b));
     System.out.println("ʹ�ã�ȥ����ߡ���ͣ�����ƽ��ֵ����:");
     System.out.printf("%s���÷�:%5.3f%n",zhang.getName(),zhang.getScore());
     System.out.printf("%s���÷�:%5.3f%n",li.getName(),li.getScore());            
  }
}
