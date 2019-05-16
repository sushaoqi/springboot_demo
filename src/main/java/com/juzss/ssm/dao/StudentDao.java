package com.juzss.ssm.dao;

import com.juzss.ssm.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CLassName  StudentDao
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/5/16 17:58
 * @Version 1.0
 **/
@Mapper
@Repository
public interface StudentDao {


    /**
     * 增
     **/
    @Insert("INSERT INTO student(name) VALUES(#{name})")
    void insert(String name);

    /**
     * 删
     **/
    @Delete("DELETE  FROM student WHERE id=#{id}")
    void del(Long id);

    /**
     * 改
     **/
    @Update("UPDATE student SET name=#{name} WHERE id=#{id}")
    void upd(Student stu);

    /**
     * 根据id查询
     **/
    @Select("select * from student where id=#{id}")
    Student get(Long id);

    /**
     * 查询所有
     **/
    @Select("select  * from student")
    List<Student> list();
}
