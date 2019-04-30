package com.designpattern2.pxoxy.rmitest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


/**
* Created by IntelliJ IDEA.
* User: leizhimin
* Date: 2008-8-7 22:21:07
* �ͻ��˲��ԣ��ڿͻ��˵���Զ�̶����ϵ�Զ�̷����������ؽ����
*/
public class HelloClient {
    public static void main(String args[]){
        try {
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ���
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8888/RHello");
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("����"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();  
        }
    }
}