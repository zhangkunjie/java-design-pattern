package com.designpattern2.simplefactory.simplefactory3;

//�ڶ��ּ򵥹���ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������
//������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}
	public Sender produceSms() {
		return new SmsSender();
	}

}
