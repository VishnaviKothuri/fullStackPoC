package com.poc.coviddashboard.controller;

import com.poc.coviddashboard.model.UserInfoTable;
import com.poc.coviddashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
@RequestMapping("/pocApi")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public String registerUser(@Valid @RequestBody UserInfoTable user){
        List<UserInfoTable> users= userService.getAllUsers();
        for(UserInfoTable userInfoTable:users)
        {
            System.out.println("Registered User :: "+user.toString());
            if(userInfoTable.equals(user)){
                System.out.println("User already exists!!");
                return "USER ALREADY EXISTS";
            }
        }
        userService.saveNewUser(user);
        return "User Registered..";
    }

    @PostMapping("/users/login")
    public String loginUser(@Valid @RequestBody UserInfoTable user){
        List<UserInfoTable> users= userService.getAllUsers();
        System.out.println("Login called");
        for(UserInfoTable userInfoTable:users){
            if(userInfoTable.equals(user)){
                user.setLoggedIn(1);
                userService.saveNewUser(user);
                System.out.println("Inside login");
                return "Login Success";
            }
        }
        return "Failed";
    }

    @PostMapping("/users/logout")
    public void logUserOut(@Valid @RequestBody UserInfoTable user){
        if(user.isLoggedIn()==1){
            System.out.println("User :: "+user.toString());
            user.setLoggedIn(0);
        }
    }

    @RequestMapping(path = "/ping",method = RequestMethod.GET)
    public String pingApi(){
        return "I'm alive";
    }

}
