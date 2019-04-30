package com.designpattern2.visitor.visitor1;
public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
