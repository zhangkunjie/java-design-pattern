package com.designpattern2.simplefactory.simplefactory1;
//�����꣺ͨ����ϼ�������������������
public class PizzaStore {
	SimplePizzaFactory factory;//������������Ĺ���
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
