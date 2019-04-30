package com.designpattern2.command.command2;
//���������
public class MyCommand implements Command {
	private Receiver receiver;//����Ľ�����

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
    //ʹִ����ִ������
	@Override
	public void execute() {
		receiver.action();
	}
}
