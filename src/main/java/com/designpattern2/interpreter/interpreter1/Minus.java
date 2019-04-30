package com.designpattern2.interpreter.interpreter1;
//����
public class Minus implements Expression {  
		  
	@Override  
    public int interpret(Context context) {  
        return context.getNum1()-context.getNum2();  
	 }  
}  
