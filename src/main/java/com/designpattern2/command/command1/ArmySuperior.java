package com.designpattern2.command.command1;

/**
 * �����ߣ�Invoker��
 */
public class ArmySuperior {
	Command command;// ������ž������������

	public void setCommand(Command command) {
		this.command = command;
	}

	// �þ�������ִ��execute()����
	public void startExecuteCommand() {
		command.execute();
	}
}
