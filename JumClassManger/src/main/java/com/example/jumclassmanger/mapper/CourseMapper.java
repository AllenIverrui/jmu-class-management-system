package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Course;
import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(String cno);

    int insert(Course row);

    Course selectByPrimaryKey(String cno);

    List<Course> selectAll();

    int updateByPrimaryKey(Course row);
}