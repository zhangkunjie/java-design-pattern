package com.designpattern2.builder.builder1;

public class Director {
	private Builder builder = new ConcreteBuilder();

	public Product getAProduct() {
		builder.setPart("��������", "X7");
		return builder.getProduct();
	}

	public Product getBProduct() {
		builder.setPart("�µ�����", "Q5");
		return builder.getProduct();
	}
}
