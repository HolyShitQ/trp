package com.frq.trp.service.impl;

import com.frq.trp.mapper.UserExtMapper;
import com.frq.trp.model.User;
import com.frq.trp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserExtMapper userExtMapper;

    @Override
    public List<User> getAllUser() {
        return userExtMapper.getAllUser();
    }
}
