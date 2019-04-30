package com.designpattern2.visitor.visitor1;
//������ģʽ���������ݽṹ����ȶ���ϵͳ�������ݽṹ���㷨����
public class Test {
	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}

}
