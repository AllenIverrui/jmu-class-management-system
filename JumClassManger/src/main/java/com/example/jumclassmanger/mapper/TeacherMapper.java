package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(String tno);

    int insert(Teacher row);

    Teacher selectByPrimaryKey(String tno);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher row);
}