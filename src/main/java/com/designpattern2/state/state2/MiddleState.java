package com.designpattern2.state.state2;

//����״̬��Concrete State��
public class MiddleState implements TemperatureState{
       double n=10;
       MiddleState(int n){
            if(n>0&&n<=26)
               this.n=n;
       }
       public void showTemperature(){
              System.out.println("�����¶���"+n+"���������¶�");
       }
}
