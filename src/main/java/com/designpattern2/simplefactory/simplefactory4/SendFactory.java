package com.designpattern2.simplefactory.simplefactory4;

//�����ּ򵥹���ģʽ���������������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü���,���ֱȽϳ���
public class SendFactory {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
