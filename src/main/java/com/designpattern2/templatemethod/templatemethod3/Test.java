package com.designpattern2.templatemethod.templatemethod3;
//������
public class Test {
	public static void main(String[] args) {
		AbstractCalculator cal ;
		String exp;
		int result;
	    exp= "8+8";
		cal= new Plus();
		result= cal.calculate(exp, "\\+");
		System.out.println(result);
		
		exp = "10-8";
		cal= new Minus();
		result = cal.calculate(exp, "\\-");
		System.out.println(result);

	}
}
