package com.designpattern2.prototype.prototype1;

//ģʽ��ʹ��
public class Application{
    public static void main(String args[]){
         Cubic  cubic=new Cubic(12,20,66);
         System.out.println("cubic�ĳ�����͸ߣ�");
         System.out.println(cubic.length+","+cubic.width+","+cubic.height);
         try{
                Cubic  cubicCopy=(Cubic)cubic.cloneMe();
                System.out.println("cubicCopy�ĳ�����͸ߣ�");
                System.out.println(cubicCopy.length+","+cubicCopy.width+","
                +cubicCopy.height);
         }
         catch(CloneNotSupportedException exp){}
         Goat  goat=new Goat();
         goat.setColor(new StringBuffer("����ɫ��ɽ��"));
         System.out.println("goat��"+goat.getColor());
          try{
                 Goat  goatCopy=(Goat)goat.cloneMe();
                 System.out.println("goatCopy��"+goatCopy.getColor()); 
                 System.out.println("goatCopy���Լ�����ɫ�ı�ɺ�ɫ");
                 goatCopy.setColor(new StringBuffer("����ɫ��ɽ��"));
                 System.out.println("goat��Ȼ��"+goat.getColor());
                 System.out.println("goatCopy��"+goatCopy.getColor()); 
          }
          catch(CloneNotSupportedException exp){} 
    }
}
