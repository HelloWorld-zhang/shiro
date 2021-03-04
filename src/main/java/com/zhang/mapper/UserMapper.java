package com.zhang.mapper;

import com.zhang.entity.User;

public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);
}
