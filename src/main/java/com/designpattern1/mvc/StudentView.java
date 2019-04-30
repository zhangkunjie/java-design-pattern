package com.designpattern1.mvc;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午7:56
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
