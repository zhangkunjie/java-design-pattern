package com.designpattern2.simplefactory.simplefactory1;
//��������
public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");//֥ʿ
		toppings.add("Parmesan");//����
	}
}
