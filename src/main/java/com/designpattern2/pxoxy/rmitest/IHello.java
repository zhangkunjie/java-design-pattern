package com.designpattern2.pxoxy.rmitest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
* Created by IntelliJ IDEA.
* User: leizhimin
* Date: 2008-8-7 21:50:02
* ����һ��Զ�̽ӿڣ�����̳�Remote�ӿڣ�������ҪԶ�̵��õķ��������׳�RemoteException�쳣
*/
public interface IHello extends Remote {

    /**
     * �򵥵ķ��ء�Hello World��"����
     * @return ���ء�Hello World��"����
     * @throws RemoteException
     */
    public String helloWorld() throws RemoteException;

    /**
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ���
     * @param someBodyName  ����
     * @return ������Ӧ���ʺ���
     * @throws RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}