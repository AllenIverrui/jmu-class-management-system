package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Student;
import com.example.jumclassmanger.bean.StudentVo;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String sno);

    int insert(Student row);

    Student selectByPrimaryKey(String sno);

    List<Student> selectAll();

    int updateByPrimaryKey(Student row);

    /**
     * 查询所有学生信息
     */
    List<StudentVo> selectAllStudent();

    /**
     * 根据sno 查询学生所有信息
     */
    List<StudentVo> getAllMsgsBySno(String sno);
    /**
     * 根据cno 查询学生所有信息
     */
    List<StudentVo> getAllMsgsByCno(String sno);

    /**
     * 通过学号删除学生
     */
    int deleteStudenAll(String sno);
    /**
     * 通过姓名查找学生
     */
    Student searchStudentByName(String sname);
    List<Student> searchStudentByClass(Integer classid);
}