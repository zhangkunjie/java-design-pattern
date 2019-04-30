package com.designpattern2.chainofresposibility.chainofresposibility1;

import java.util.ArrayList;

public class Beijing implements Handler{
    private Handler handler;              //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
    private ArrayList<String> numberList; //������֤������������Ա�
    Beijing(){
       numberList=new ArrayList<String>();
       numberList.add("11129812340930034"); //����ʹ��ģ������֤����
       numberList.add("10120810340930632");
       numberList.add("22029812340930034"); 
       numberList.add("32620810340930632");
    }
    public void handleRequest(String number){
       if(numberList.contains(number))
          System.out.println("�����ڱ�����ס");
       else{
          System.out.println("���˲��ڱ�����ס");
          if(handler!=null)
            handler.handleRequest(number);      //�����󴫵ݸ���һ��������
       }
    }
    public void setNextHandler(Handler handler){
       this.handler=handler;
    }
}
