package com.designpattern2.adapter.adapter6;

import java.util.*;
//��Enumeration������Iterator
public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
 
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
 
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
 
	public Object next() {
		return enumeration.nextElement();
	}
    //Enumerationû��remove�ķ���������remove��ʱ���׳��쳣
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
