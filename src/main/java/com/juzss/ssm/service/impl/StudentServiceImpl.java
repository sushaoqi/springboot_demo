package com.juzss.ssm.service.impl;

import com.juzss.ssm.dao.StudentDao;
import com.juzss.ssm.domain.Student;
import com.juzss.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * CLassName  StudentServiceImpl
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/5/16 18:15
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public void add(String name) {
          studentDao.insert(name);
    }

    @Override
    public void del(Long id) {
         studentDao.del(id);
    }

    @Override
    public void upd(Student stu) {
       studentDao.upd(stu);
    }

    @Override
    public Student get(Long id) {
        return studentDao.get(id);
    }

    @Override
    public List<Student> list() {
        return studentDao.list();
    }
}
