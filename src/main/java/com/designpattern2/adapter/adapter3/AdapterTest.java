package com.designpattern2.adapter.adapter3;
//Adapter��̳�Source�࣬ʵ��Targetable�ӿڣ������ǲ����ࣺ
public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
