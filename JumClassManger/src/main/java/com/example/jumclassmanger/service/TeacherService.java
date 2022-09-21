package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Teacher;
import com.example.jumclassmanger.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements TeacherMapper {
    @Autowired
    TeacherMapper teacherMapper;
    int flag=1;
    @Override
    public int deleteByPrimaryKey(String tno) {
        try {
            teacherMapper.deleteByPrimaryKey(tno);
        }catch (Exception e){
            return -flag;
        }return flag;
    }

    @Override
    public int insert(Teacher row) {
        try {
            teacherMapper.insert(row);
        }catch (Exception e){
            return -flag;
        }
        return flag;
    }

    @Override
    public Teacher selectByPrimaryKey(String tno) {
        return teacherMapper.selectByPrimaryKey(tno);
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Teacher row) {
        try {
            teacherMapper.updateByPrimaryKey(row);
        }catch (Exception e){
            return -flag;
        }return flag;
    }
}
