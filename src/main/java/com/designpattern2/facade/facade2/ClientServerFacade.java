package com.designpattern2.facade.facade2;

//��ۣ����ຬ��������ϵͳ��ʵ��
public class ClientServerFacade{
    private CheckWord checkWord;
    private Charge charge;
    private TypeSeting typeSeting;
    String advertisement;
    public ClientServerFacade(String advertisement){
       this.advertisement=advertisement;
       checkWord=new CheckWord(advertisement);
       charge=new Charge(checkWord);
       typeSeting=new TypeSeting(advertisement); 
    }
    public void doAdvertisement(){ 
       checkWord.setChargeAmount();
       charge.giveCharge();
       typeSeting.typeSeting();
    } 
}
