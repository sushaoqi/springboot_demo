package com.juzss.ssm.controller;

import com.juzss.ssm.domain.Student;
import com.juzss.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CLassName  StudentController
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/5/16 18:18
 * @Version 1.0
 **/
@RestController
public class StudentController {



    @Autowired
    StudentService studentService;


    /**
     * 增
     **/
    @RequestMapping("/add")
    public String add(String name){
        studentService.add(name);
        return "add success";
    }


    /**
     * 增
     **/
    @RequestMapping("/del")
    public String del(Long id){
        studentService.del(id);
        return "del success";
    }


    /**
     * 改
     **/
    @RequestMapping("/upd")
    public String upd(){
        Student student = new Student();
        student.setId(1L);
        student.setName("ccc");
        studentService.upd(student);
        return "upd success";
        
    }

    /**
     * 根据id查询
     **/
    @RequestMapping("/get")
    public  Student get(Long id){
        return  studentService.get(id);
    }


    /**
      * 查询所有
     **/
    @RequestMapping("/list")
    public List<Student> list(){
        return studentService.list();
    }
}
