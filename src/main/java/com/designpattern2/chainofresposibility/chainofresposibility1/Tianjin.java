package com.designpattern2.chainofresposibility.chainofresposibility1;

import java.util.ArrayList;

public class Tianjin implements Handler{
    private Handler handler;              //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
    private ArrayList<String> numberList; //������֤������������Ա�
    Tianjin(){
       numberList=new ArrayList<String>();
       numberList.add("10029812340930034"); //����ʹ��ģ������֤����
       numberList.add("20020810340430632");
       numberList.add("30029812340930034"); 
       numberList.add("50020810340930632");
    }
    public void handleRequest(String number){
       if(numberList.contains(number))
          System.out.println("����������ס");
       else{
          System.out.println("���˲�������ס");
          if(handler!=null)
             handler.handleRequest(number);      //�����󴫵ݸ���һ��������
       }
    }
    public void setNextHandler(Handler handler){
       this.handler=handler;
    }
}
