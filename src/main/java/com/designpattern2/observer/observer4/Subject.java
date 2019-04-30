package com.designpattern2.observer.observer4;
//����ӿ�
public interface Subject {
	/* ���ӹ۲��� */
	public void add(Observer observer);

	/* ɾ���۲��� */
	public void del(Observer observer);

	/* ֪ͨ���еĹ۲��� */
	public void notifyObservers();

	/* ����Ĳ��� */
	public void operation();
}
