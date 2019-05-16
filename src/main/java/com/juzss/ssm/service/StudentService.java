package com.juzss.ssm.service;

import com.juzss.ssm.domain.Student;

import java.util.List;

public interface StudentService {

    void add(String name);

    void del(Long id);

    void upd(Student stu);

    Student get(Long id);

    List<Student> list();

}
