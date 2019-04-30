package com.designpattern2.prototype.prototype1;

//����ģ�ͣ�Concrete Prototype��
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//ɽ��
public class Goat implements Prototype, Serializable {
	StringBuffer color;

	public void setColor(StringBuffer c) {
		color = c;
	}

	public StringBuffer getColor() {
		return color;
	}

	//��ȸ���ģʽ
	public Object cloneMe() throws CloneNotSupportedException { // ʵ�ֽӿ��еķ���
		Object object = null;
		try {
			ByteArrayOutputStream outOne = new ByteArrayOutputStream();
			ObjectOutputStream outTwo = new ObjectOutputStream(outOne);
			outTwo.writeObject(this); // ��ԭ�Ͷ���д����������
			ByteArrayInputStream inOne = new ByteArrayInputStream(outOne
					.toByteArray());
			ObjectInputStream inTwo = new ObjectInputStream(inOne);
			object = inTwo.readObject(); // �����µĶ���ԭ�͵ĸ���Ʒ
		} catch (Exception event) {
			System.out.println(event);
		}
		return object;
	}
}
