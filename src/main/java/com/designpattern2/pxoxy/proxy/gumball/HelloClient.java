package com.designpattern2.pxoxy.proxy.gumball;

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
        	GumballMachineRemote rhello =(GumballMachineRemote) Naming.lookup("rmi://localhost:8890/gumballmachine");
            System.out.println(rhello.getLocation());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();  
        }
    }
}