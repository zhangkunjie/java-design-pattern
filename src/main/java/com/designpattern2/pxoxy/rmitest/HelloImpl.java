package com.designpattern2.pxoxy.rmitest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
* Created by IntelliJ IDEA.
* User: leizhimin
* Date: 2008-8-7 21:56:47
* Զ�̵Ľӿڵ�ʵ��
*/
public class HelloImpl extends UnicastRemoteObject implements IHello {
    /**
     * ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д�����������׳�RemoteException�쳣
     *
     * @throws RemoteException
     */
    public HelloImpl() throws RemoteException {
    }

    /**
     * �򵥵ķ��ء�Hello World��"����
     *
     * @return ���ء�Hello World��"����
     * @throws RemoteException
     */
    public String helloWorld() throws RemoteException {
        return "Hello World!";
    }

    /**
     * һ���򵥵�ҵ�񷽷������ݴ��������������Ӧ���ʺ���
     *
     * @param someBodyName ����
     * @return ������Ӧ���ʺ���
     * @throws RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
        return "��ã�" + someBodyName + "!";
    }
}