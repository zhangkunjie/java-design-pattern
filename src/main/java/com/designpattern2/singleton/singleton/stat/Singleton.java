package com.designpattern2.singleton.singleton.stat;
//����ģʽ������ģʽ
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
