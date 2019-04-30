package com.designpattern2.templatemethod.templatemethod3;

public class Minus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1-num2;
	}
}