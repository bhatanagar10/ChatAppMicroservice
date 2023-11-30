package com.app.user.service;

import com.app.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void insert(User user);
    public User getData(Integer userID);
}
