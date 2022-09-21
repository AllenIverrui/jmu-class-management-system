package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Manger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



public interface MangerMapper {
    int deleteByPrimaryKey(String username);

    int insert(Manger row);

    Manger selectByPrimaryKey(String username);

    List<Manger> selectAll();

    int updateByPrimaryKey(Manger row);
    /**
     * 登录检查
     */
    Manger checkLogin(Manger manger);
}