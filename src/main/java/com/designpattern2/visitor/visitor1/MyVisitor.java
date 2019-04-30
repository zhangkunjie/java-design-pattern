package com.designpattern2.visitor.visitor1;
//�������ࣺ�����Ҫ���ʵĶ���
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject��" + sub.getSubject());
	}
}
