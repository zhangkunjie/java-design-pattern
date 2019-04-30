package com.designpattern2.factorymethod.factorymethod1;
//�����ʼ��Ĺ���
public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}
