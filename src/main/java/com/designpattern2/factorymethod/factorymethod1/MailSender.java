package com.designpattern2.factorymethod.factorymethod1;
//�����ʼ���ʵ����
public class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}
}
