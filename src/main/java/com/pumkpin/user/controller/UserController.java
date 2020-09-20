package com.pumkpin.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: user
 * @DESCRIPTION:
 * @USER: huangxihuan
 * @DATE: 2020/9/19 0019 23:48
 */
//23
@RestController
@RequestMapping
public class UserController {
    @GetMapping(value="hello")
    public String getHello(){
        return "hello";
    }
}
