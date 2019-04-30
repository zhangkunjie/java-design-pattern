package com.designpattern2.simplefactory.simplefactory2;
//��һ�ּ򵥹���ģʽ������һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ������!");
			return null;
		}
	}
}
