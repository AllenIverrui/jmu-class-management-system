package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Student;
import com.example.jumclassmanger.bean.StudentVo;
import com.example.jumclassmanger.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentMapper {
    @Autowired
    StudentMapper studentMapper;
    int flag=1;
    @Override
    public int deleteByPrimaryKey(String sno) {
       try {
           studentMapper.deleteByPrimaryKey(sno);
       }catch (Exception e){
           return -flag;
       }return flag;
    }

    /**
     * 通过学号删除学生
     *
     * @param sno
     */
    @Override
    public int deleteStudenAll(String sno) {
        return studentMapper.deleteStudenAll(sno);
    }

    /**
     * 通过姓名查找学生
     *
     * @param sname
     */
    @Override
    public Student searchStudentByName(String sname) {
        return studentMapper.searchStudentByName(sname);
    }

    @Override
    public List<Student> searchStudentByClass(Integer classid) {
        return studentMapper.searchStudentByClass(classid);
    }

    @Override
    public int insert(Student row) {
        try {
            studentMapper.insert(row);
        }catch (Exception e){
            return -flag;
        }return flag;
    }

    @Override
    public Student selectByPrimaryKey(String sno) {
        return studentMapper.selectByPrimaryKey(sno);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Student row) {
        try {
            studentMapper.updateByPrimaryKey(row);
        }catch (Exception e ){
            return -flag;
        }return flag;
    }

    /**
     * 查询所有学生信息
     */
    @Override
    public List<StudentVo> selectAllStudent() {
        return  studentMapper.selectAllStudent();
    }

    /**
     * 根据sno 查询学生所有信息
     *
     * @param sno
     */
    @Override
    public List<StudentVo> getAllMsgsBySno(String sno) {
        return studentMapper.getAllMsgsBySno(sno);
    }

    /**
     * 根据cno 查询学生所有信息
     *
     * @param sno
     */
    @Override
    public List<StudentVo> getAllMsgsByCno(String cno) {
        return studentMapper.getAllMsgsByCno(cno);
    }


}
