package com.designpattern2.iterator.iterator2;

public class RenMinMony {
	int value;
	private boolean isTrue;

	RenMinMony(int value, boolean b) {
		this.value = value;
		isTrue = b;
	}

	public boolean getIsTrue() {
		return isTrue;
	}

	public int getValue() {
		return value;
	}

}
