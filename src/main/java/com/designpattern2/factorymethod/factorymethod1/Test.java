package com.designpattern2.factorymethod.factorymethod1;
/*
 * �ô�:���������������һ�����ܣ�����ʱ��Ϣ����ֻ����һ��ʵ���࣬ʵ��Sender�ӿڣ�ͬʱ��һ�������࣬
 * ʵ��Provider�ӿڣ���OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣����������չ�ԽϺ�
 */
public class Test {
	public static void main(String[] args) {
		//�����ʼ�
		Provider mailProvider = new SendMailFactory();
		Sender mailSender = mailProvider.produce();
		mailSender.Send();
		//���Ͷ���
		Provider  smsProvider = new SendSmsFactory();
		Sender  smsSender = smsProvider.produce();
		smsSender.Send();
	}
}
