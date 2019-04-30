package com.designpattern2.chainofresposibility.chainofresposibility1;

import java.util.ArrayList;

public class Shanghai implements Handler{
    private Handler handler;              //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
    private ArrayList<String> numberList; //������֤������������Ա�
    Shanghai(){
       numberList=new ArrayList<String>();
       numberList.add("34529812340930034"); //����ʹ��ģ������֤����
       numberList.add("98720810340430632");
       numberList.add("36529812340930034"); 
       numberList.add("77720810340930632");
    }
    public void handleRequest(String number){
       if(numberList.contains(number))
          System.out.println("�������Ϻ���ס");
       else{
          System.out.println("���˲����Ϻ���ס");
          if(handler!=null)
             handler.handleRequest(number);      //�����󴫵ݸ���һ��������
       }
    }
    public void setNextHandler(Handler handler){
       this.handler=handler;
    }
}
