package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Classes;
import java.util.List;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入班级
     * @param row
     * @return
     */
    int insert(Classes row);

    Classes selectByPrimaryKey(Integer id);

    List<Classes> selectAll();

    int updateByPrimaryKey(Classes row);

    /**
     * 通过姓名查找班级
     */
    Classes searchClassesByName(String name);
}