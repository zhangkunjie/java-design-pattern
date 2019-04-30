package com.designpattern2.observer.observer4;

public class MySubject extends AbstractSubject {  
	  
    @Override  
	    public void operation() {  
        System.out.println("update self!");  
        notifyObservers();  
    }  
}