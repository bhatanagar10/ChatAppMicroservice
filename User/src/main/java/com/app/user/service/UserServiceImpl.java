package com.app.user.service;

import com.app.user.entity.User;
import com.app.user.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJPARepository repository;

    @Override
    public User getData(Integer userID) {
        return repository.findById(userID).get();
    }

    @Override
    public void insert(User user) {
        repository.save(user);
    }
}
