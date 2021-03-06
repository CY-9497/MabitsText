package com.ch.mapper;

import com.ch.domain.User;

import java.util.List;

/**
 * @author 青梅君
 */
public interface UserMapper {
    /**
     * 按条件查询用户
     * @param user 用户条件
     * @return 结果
     */
    List<User> findByCondition(User user);

    /**
     * 按名字查询
     * @param ids 用户名
     * @return 结果
     */
    List<User> findByIds(List<String> ids);

    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> findAll();

    /**
     * 插入用户信息
     * @param user 用户
     */
    void insertUser(User user);
}
