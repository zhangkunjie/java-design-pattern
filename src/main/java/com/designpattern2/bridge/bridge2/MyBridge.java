package com.designpattern2.bridge.bridge2;

public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}  