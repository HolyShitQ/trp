package com.frq.trp.controller;

import com.frq.trp.model.User;
import com.frq.trp.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ray
 */
@RestController()
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
