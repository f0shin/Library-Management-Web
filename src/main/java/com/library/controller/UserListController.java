package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.library.model.User;
import com.library.service.UserService;

import java.util.List;

@Controller
public class UserListController {
    private final UserService userService;

    public UserListController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        List<User> users = userService.getAllUsers();
        System.out.println("✅ UserController - /users - GET 요청 정상 처리!");
        model.addAttribute("title", users);
        return "userList";
    }
}

