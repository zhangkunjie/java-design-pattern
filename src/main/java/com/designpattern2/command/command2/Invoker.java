package com.designpattern2.command.command2;

//����ĵ�����
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	public void action() {
		command.execute();
	}

}
