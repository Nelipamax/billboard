package com.nelipamax.billboard.controllers;

import com.nelipamax.billboard.entities.User;
import com.nelipamax.billboard.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

 /*   @PostMapping("/login")
    public String login () {
        return "products";
    }*/

    @GetMapping("/registration")
    public String registration() {
        System.out.println("go to reg page");
        return "registration";
    }

    @PostMapping("/registration")
    public String create(User user) {
        System.out.println("reg request in");
        userService.createUser(user);
        System.out.println("after method");
        return "redirect: /login";
    }


}
