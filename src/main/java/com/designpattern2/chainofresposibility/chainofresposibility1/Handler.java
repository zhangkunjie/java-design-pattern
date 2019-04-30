package com.designpattern2.chainofresposibility.chainofresposibility1;
//����Ľӿ�
public interface Handler{
	   public abstract void handleRequest(String number);
	   public abstract void setNextHandler(Handler handler);
	}
