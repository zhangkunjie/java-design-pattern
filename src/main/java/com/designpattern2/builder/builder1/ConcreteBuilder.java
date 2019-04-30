package com.designpattern2.builder.builder1;
//����Ľ�����
public class ConcreteBuilder extends Builder {
	private Product product = new Product();
	public Product getProduct() {
		return product;
	}
	public void setPart(String arg1, String arg2) {
		product.setName(arg1);
		product.setType(arg2);
	}
}
