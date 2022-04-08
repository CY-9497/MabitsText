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
}
