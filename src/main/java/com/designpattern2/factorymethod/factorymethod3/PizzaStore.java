package com.designpattern2.factorymethod.factorymethod3;
//����������ĸ���
public abstract class PizzaStore {
    //���������ķ����ǳ���ģ���Ҫ��������ȥ����ʵ��
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
