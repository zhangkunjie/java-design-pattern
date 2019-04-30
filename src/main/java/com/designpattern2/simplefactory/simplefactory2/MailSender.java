package com.designpattern2.simplefactory.simplefactory2;

public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}
}
