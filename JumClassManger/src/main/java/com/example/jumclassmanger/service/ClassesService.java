package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Classes;
import com.example.jumclassmanger.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService implements ClassesMapper {

    @Autowired
    ClassesMapper classesMapper;
    /**
     * 执行成功返回1
     * 失败返回-1
     */
    int flag = 1;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            classesMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            return -flag;
        }
        return flag;
    }

    /**
     * 插入班级
     *
     * @param row
     * @return
     */
    @Override
    public int insert(Classes row) {
        try {
            classesMapper.insert(row);
        } catch (Exception e) {
            return -flag;
        }
        return flag;
    }

    @Override
    public Classes selectByPrimaryKey(Integer id) {
        return classesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Classes> selectAll() {
        return classesMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Classes row) {
        return classesMapper.updateByPrimaryKey(row);
    }

    /**
     * 通过姓名查找班级
     *
     * @param name
     */
    @Override
    public Classes searchClassesByName(String name) {
        return classesMapper.searchClassesByName(name);
    }
}
