package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Course;
import com.example.jumclassmanger.mapper.CourseMapper;
//import com.sun.source.tree.ReturnTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseMapper {
    @Autowired
    CourseMapper courseMapper;
    int flag = 1;

    @Override
    public int deleteByPrimaryKey(String cno) {
        try {
            courseMapper.deleteByPrimaryKey(cno);
        }catch ( Exception e){
            return -flag;
        }return flag;
    }

    @Override
    public int insert(Course row) {
        try {
            courseMapper.insert(row);
        } catch (Exception e) {
            return -flag;
        }
        return flag;
    }

    @Override
    public Course selectByPrimaryKey(String cno) {
        return courseMapper.selectByPrimaryKey(cno);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Course row) {
        try {
            courseMapper.updateByPrimaryKey(row);
        } catch (Exception e) {
            return -flag;

        }
        return flag;
    }
}
