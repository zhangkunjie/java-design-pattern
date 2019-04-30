package com.designpattern2.bridge.bridge1;
//ģʽ��ʹ��
/*
 ģʽ���ŵ�:����ʵ�������ʹ�����ʵ�ֿ��Զ��������š�
���õ��龰:�����ó����ĳЩ��Ҫ��ʵ�ִ����ǹ̶��İ󶨹�ϵ���ⲿ��ʵ�ֿ�����ʱ��̬������
�����ʵ���߶����Լ̳еķ�ʽ�������������Ӱ�죬�����������ڼ������Ҫ��̬�Ľ�һ������������ʵ����һ��ʵ���ߵ������ʵ��������ϡ�
ϣ����ʵ���߲�δ�����޸ĶԳ���㲻����Ӱ�죬�������Ĵ��벻�����±��룬��֮��Ȼ��
*/
public class Application{
     public static void main(String args[]) {
           double width=63,height=30;
           int floorNumber=8;
           double unitPrice=6867.38;
           BuildingDesign  design=new HouseDesign(width,height,floorNumber);
           System.out.println("��"+width+"�ף���"+height+"�ף�����Ϊ"+floorNumber);
           ArchitectureCost  cost=new BuildingCost(design,unitPrice);
           double price=cost.giveCost();
           System.out.printf("ÿƽ����ۣ�"+unitPrice+"Ԫ����ҵ¥�Ľ���ɱ���%.2fԪ\n",price);
           width=52; 
           height=28;
           floorNumber=6;
           unitPrice=2687.88;
           design=new HouseDesign(width,height,floorNumber);
           System.out.println("��"+width+"�ף���"+height+"�ף�����Ϊ"+floorNumber);
           cost=new BuildingCost(design,unitPrice);
           price=cost.giveCost();
           System.out.printf("ÿƽ����ۣ�"+unitPrice+"Ԫ��סլ¥�Ľ���ɱ���%.2fԪ\n",price);
     }
}
