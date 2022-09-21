package com.example.jumclassmanger.mapper;

import com.example.jumclassmanger.bean.Manger;
import com.example.jumclassmanger.bean.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User row);

    List<User> selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User row);

    /**
     * 根据id激活用户
     * @param id
     */
    int letAllow(User user);

    /**
     * 登录检查
     */
    User checkLogin(User user);
    /**
     * 修改密码
     */
    int updatePassword(User user);
}