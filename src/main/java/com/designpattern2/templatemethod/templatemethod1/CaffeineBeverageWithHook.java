package com.designpattern2.templatemethod.templatemethod1;
//ģ�常��
public abstract class CaffeineBeverageWithHook {
    //ģ�巽��
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
    //���ӣ����������ж�ĳЩģ�巽���Ƿ�ִ��
	boolean customerWantsCondiments() {
		return true;
	}
}
