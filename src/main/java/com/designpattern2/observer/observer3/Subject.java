package com.designpattern2.observer.observer3;

//����ӿ�
public interface Subject{
   public void addObserver(Observer o);
   public void deleteObserver(Observer o);
   public void notifyObservers();
}
