package com.designpattern2.iterator.iterator3;


public interface Collection {
	public Iterator iterator();
	/* ȡ�ü���Ԫ�� */
	public Object get(int i);
	/* ȡ�ü��ϴ�С */
	public int size();

}
