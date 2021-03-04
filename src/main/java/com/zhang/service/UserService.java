package com.zhang.service;

import com.zhang.entity.User;

public interface UserService {

    public User findByName(String name);
    public User findById(Integer id);
}
