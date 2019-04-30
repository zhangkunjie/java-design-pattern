package com.designpattern2.flyweight.flyweight1;

public class ConcreteFlyweight implements Flyweight {
	private double width;
	private double height;
	private double length;

	public  ConcreteFlyweight(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void printMess(String mess) {
		 System.out.print(mess);        //输出外部数据mess
         System.out.print(" 宽度："+width);  //输出内部数据width
         System.out.print(" 高度："+height);
         System.out.println("长度："+length);

	}
}
