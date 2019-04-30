package com.designpattern2.simplefactory.simplefactory3;

public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}
}
