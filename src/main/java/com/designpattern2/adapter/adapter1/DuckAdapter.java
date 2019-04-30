package com.designpattern2.adapter.adapter1;
import java.util.Random;
//Ѽ������𼦵�������
public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {//rand.next(n):ȡ0-n֮��������������n
		     duck.fly();
		}
	}
}
