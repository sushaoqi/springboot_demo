package com.juzss.ssm.domain;

/**
 * CLassName  Student
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/5/16 18:03
 * @Version 1.0
 **/

public class Student {


    private Long id;
    private String name;


    public Student(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
