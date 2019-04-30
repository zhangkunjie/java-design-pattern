package com.designpattern2.memento.memento1;
//����¼���󣬴洢����Ҫ����Ķ����ĳЩ����
public class Memento {

	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
