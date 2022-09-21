package com.example.jumclassmanger.service;

import com.example.jumclassmanger.bean.User;
import com.example.jumclassmanger.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper {

    @Autowired
    UserMapper userMapper;
    int flag=1;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User row) {
        try {
            userMapper.insert(row);
        } catch (Exception e) {
            return -1;
        }
        return 1;
    }

    @Override
    public List<User> selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 登录检查
     *
     * @param user
     */
    @Override
    public User checkLogin(User user) {
        return userMapper.checkLogin(user);
    }

    /**
     * 修改密码
     *
     * @param user
     */
    @Override
    public int updatePassword(User user) {
        try {
            userMapper.updatePassword(user);
        }catch ( Exception e){
            return -flag;
        }return flag;
    }

    /**
     * 根据id激活用户
     *
     * @param id
     */
    @Override
    public int letAllow(User user) {
        return userMapper.letAllow(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User row) {
        return userMapper.updateByPrimaryKey(row);
    }
}
