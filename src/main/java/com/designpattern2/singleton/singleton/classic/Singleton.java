package com.designpattern2.singleton.singleton.classic;
//�ӳټ��ص���ģʽ,�����̲߳���ȫ!!!
public class Singleton {
	private static Singleton uniqueInstance;
	// other useful instance variables here
	private Singleton() {
	}
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	// other useful methods here
}
