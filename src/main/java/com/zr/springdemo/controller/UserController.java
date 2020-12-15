package com.zr.springdemo.controller;

import com.zr.springdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author nicaide
 * @date 2020年12月15日 14:50:00
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/one")
    public User getUser() {
        User user = new User("name", "1");
        return user;
    }
}
