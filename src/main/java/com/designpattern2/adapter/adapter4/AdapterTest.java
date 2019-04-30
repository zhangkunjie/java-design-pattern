package com.designpattern2.adapter.adapter4;
public class AdapterTest {

	public static void main(String[] args) {
		 Source source = new Source();  
		 Targetable target = new Wrapper(source);  
	     target.method1();  
		 target.method2();  
	}
}
