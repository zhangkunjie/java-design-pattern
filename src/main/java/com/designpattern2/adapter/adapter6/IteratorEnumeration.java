package com.designpattern2.adapter.adapter6;

import java.util.*;
//ArrayList��֧��Enumeration������֧��Iterator��ͨ��������IteratorEnumeration��ArrayList
//Ҳ����֧��Enumeration
public class IteratorEnumeration implements Enumeration {
	Iterator iterator;
 
	public IteratorEnumeration(Iterator iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
