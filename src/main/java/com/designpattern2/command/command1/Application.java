package com.designpattern2.command.command1;
/**
 * ģʽ��ʹ��
 * �����ߣ�Invoker����ֱ��������ߣ�Receiver���������������ߣ�Invoker�������������ߣ�Receiver�������ã�
 * ���������˱˴˼����ϡ�
 */
public class Application {
	public static void main(String args[]) {
		CompanyArmy sanlian = new CompanyArmy();// ����������
		Command command = new ConcreteCommand(sanlian);// ������������ƶ�������
		ArmySuperior commander = new ArmySuperior();// ����������
		commander.setCommand(command);
		commander.startExecuteCommand();
	}
}
