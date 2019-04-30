package com.designpattern2.adapter.adapter2;

public class Application {
	 public static void main(String args[]){
	       ThreeElectricOutlet outlet;        //Ŀ��ӿڣ����������
	       Wash wash=new Wash();              //ϴ�»�
	       outlet=wash;                       //ϴ�»��������������
	       System.out.println("ʹ�����������ͨ������");
	       outlet.connectElectricCurrent();   //��ͨ��������ʼϴ�·�
	       TV tv=new TV();                     //���ӻ�
	       TreeElectricAdapter adapter=new  TreeElectricAdapter(tv);//�ѵ��Ӳ�����������
	       outlet=adapter;                    //�������������������
	       System.out.println("ʹ�����������ͨ������");
	       outlet.connectElectricCurrent();   //��ͨ��������ʼ���ŵ��ӽ�Ŀ
  }
}
