package com.designpattern2.singleton.singleton.threadsafe;
//��������ģʽ��ʹ����synchronized�ؼ���֮���̰߳�ȫ�ˣ����ǻ�Ӱ������ִ��Ч��
public class Singleton {
	private static Singleton uniqueInstance;
	// other useful instance variables here
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	// other useful methods here
}
