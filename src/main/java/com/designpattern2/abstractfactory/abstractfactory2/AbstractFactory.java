package com.designpattern2.abstractfactory.abstractfactory2;
//���󹤳��ӿڣ���������ȫ��Ʒ�ֵ��豸
public interface AbstractFactory {
    /**
     * ����CPU����
     * @return CPU����
     */
    public Cpu createCpu();
    /**
     * �����������
     * @return �������
     */
    public Mainboard createMainboard();
}