package com.designpattern2.observer.observer4;
//������Ӳ��Ǻܺã�Ӧ�ÿ�observer1-3������
public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		//һ�㶼����Observer��ע���ȥSubject��������������add�۲��ߣ�������Ӳ��Ǻܺã������ο�
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}

}
