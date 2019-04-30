package com.designpattern2.simplefactory.simplefactory4;

public class FactoryTest {
	 public static void main(String[] args) {  
		 Sender sender = SendFactory.produceSms();  
		 sender.Send(); 
 
 
	}  
}
