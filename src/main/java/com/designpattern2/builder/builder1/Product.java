package com.designpattern2.builder.builder1;

public class Product {
	private String name;
	private String type;
	public void showProduct() {
		System.out.println("���ƣ�" + name);
		System.out.println("�ͺţ�" + type);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
}
