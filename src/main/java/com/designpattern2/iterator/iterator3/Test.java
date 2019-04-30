package com.designpattern2.iterator.iterator3;
//��������Ͼ���ģ���java�ĵ��������÷�
public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
