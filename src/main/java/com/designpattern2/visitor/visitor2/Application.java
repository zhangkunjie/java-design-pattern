package com.designpattern2.visitor.visitor2;

import java.util.ArrayList;
import java.util.Iterator;
//ģʽ��ʹ��
//�ŵ㣺�����ڲ��ı�һ��������Ԫ�ص��������£������µ�ʩ���ڸ�Ԫ���ϵ��²�����
//���Խ������и���Ԫ�ص�ĳЩ�������е��������У��������ڼ��ϵ�ά����Ҳ�����ڼ�����Ԫ�صĸ��á�

public class Application {
	public static void main(String args[]) {
        Visitor visitor=new Company();
        ArrayList<Student>  studentList=new  ArrayList<Student>();
        Student student=null;
        studentList.add(student=new Undergraduate("����",67,88));
        studentList.add(student=new Undergraduate("����",90,98));
        studentList.add(student=new Undergraduate("������",85,92));
        studentList.add(student=new GraduateStudent("����",88,70,87));
        studentList.add(student=new GraduateStudent("����",90,95,82));
        Iterator<Student> iter=studentList.iterator();
        while(iter.hasNext()){
             Student stu=iter.next();
             stu.accept(visitor);  
        }
  }

}
