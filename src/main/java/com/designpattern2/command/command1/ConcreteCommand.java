package com.designpattern2.command.command1;

/**
 * �������ConcreteCommand��
 */
public class ConcreteCommand implements Command {
	CompanyArmy army;// ���н����ߵ�����

	public ConcreteCommand(CompanyArmy army) {
		this.army = army;
	}

	/**
	 * ��װָ���ߵ�����
	 */
	public void execute() {
		army.sneakAttack();// ͵Ϯ����
	}
}
