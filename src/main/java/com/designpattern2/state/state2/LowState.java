package com.designpattern2.state.state2;

//3.����״̬��Concrete State��
public class LowState implements TemperatureState{
       double n=0;
       LowState(double n){
            if(n<=0)
              this.n=n;
       }
       public void showTemperature(){
              System.out.println("�����¶���"+n+"���ڵ��¶�");
       }
}
