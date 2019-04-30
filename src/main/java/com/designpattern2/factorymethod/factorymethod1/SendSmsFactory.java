package com.designpattern2.factorymethod.factorymethod1;
//���Ͷ��ŵĹ���
public class SendSmsFactory implements Provider {
	public Sender produce() {
		return new SmsSender();
	}
}
