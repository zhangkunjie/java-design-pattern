package com.designpattern2.mediator.mediator1;
//����ͬ����
public class ColleagueA  implements Colleague{
    ConcreteMediator mediator;                //�н���
    String name;
    ColleagueA(ConcreteMediator mediator){
       this.mediator=mediator;
       mediator.registerColleagueA(this);
    }
    public void setName(String name){
       this.name=name;
    }
    public String getName(){
        return name;
    } 
    public void giveMess(String [] mess){
        mediator.deliverMess(this,mess);
    }
    public void receiverMess(String mess){
       System.out.println(name+"�յ�����Ϣ:");
       System.out.println("\t"+mess);
    }
}
