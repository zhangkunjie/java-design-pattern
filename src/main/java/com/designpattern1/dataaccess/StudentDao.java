package com.designpattern1.dataaccess;

import java.util.List;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:16
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
