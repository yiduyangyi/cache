package com.yangyi.controller;

import com.yangyi.entity.User;
import com.yangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yangjinfeng on 2017/1/1.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public User user(@PathVariable Long userId) {
        return userService.get(userId);
    }
}
