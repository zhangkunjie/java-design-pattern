package com.designpattern2.simplefactory.simplefactory3;

public class FactoryTest {
	 public static void main(String[] args) {  
		 SendFactory factory = new SendFactory();  
		  Sender sender = factory.produceMail();  
		  sender.Send();  
 
	}  
}
