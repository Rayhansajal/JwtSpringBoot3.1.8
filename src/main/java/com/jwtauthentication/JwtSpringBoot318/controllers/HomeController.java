package com.jwtauthentication.JwtSpringBoot318.controllers;

import com.jwtauthentication.JwtSpringBoot318.entities.User;
import com.jwtauthentication.JwtSpringBoot318.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")


// localhost:8081/home/user
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting user");
        return userService.getUser();

    }
    @GetMapping("/current-user")
    public String getLoggedinUser(Principal principal){
        return principal.getName();
    }
}
