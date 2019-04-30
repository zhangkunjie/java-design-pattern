package com.designpattern2.simplefactory.simplefactory2;

public class FactoryTest {
	 public static void main(String[] args) {  
	      SendFactory factory = new SendFactory();  
		  Sender sender = factory.produce("mail");  
		  sender.Send();  
	}  
}
