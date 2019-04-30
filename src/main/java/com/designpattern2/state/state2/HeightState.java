package com.designpattern2.state.state2;

//����״̬��Concrete State��
public class HeightState implements TemperatureState{
       double n=26;
       HeightState(int n){
            if(n>26)
               this.n=n;
       }
       public void showTemperature(){
              System.out.println("�����¶���"+n+"���ڸ��¶�");
       }
}
