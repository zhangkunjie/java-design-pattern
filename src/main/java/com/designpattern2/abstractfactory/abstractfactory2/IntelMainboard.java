package com.designpattern2.abstractfactory.abstractfactory2;
//Inter����
public class IntelMainboard implements Mainboard {
    /**
     * CPU��۵Ŀ���
     */
    private int cpuHoles = 0;
    /**
     * ���췽��������CPU��۵Ŀ���
     * @param cpuHoles
     */
    public IntelMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("Intel�����CPU��ۿ����ǣ�" + cpuHoles);
    }
}