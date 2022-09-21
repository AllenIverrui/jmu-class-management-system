package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.Manger;
import com.example.jumclassmanger.mapper.MangerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangerService implements MangerMapper {
    @Autowired
    MangerMapper mangerMapper;
    @Override
    public int deleteByPrimaryKey(String username) {
        return mangerMapper.deleteByPrimaryKey(username);

    }

    @Override
    public int insert(Manger row) {
        return 0;
    }

    @Override
    public Manger selectByPrimaryKey(String username) {
        return null;
    }

    @Override
    public List<Manger> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Manger row) {
       return mangerMapper.updateByPrimaryKey(row);
    }

    /**
     * 登录检查
     *
     * @param manger
     */
    @Override
    public Manger checkLogin(Manger manger) {
        return mangerMapper.checkLogin(manger);
    }
}
