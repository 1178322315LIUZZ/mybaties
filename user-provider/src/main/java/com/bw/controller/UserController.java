package com.bw.controller;

import com.bw.entity.User;
import com.bw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService iUserService;
    @RequestMapping("list")
    public String getuse(@RequestParam(defaultValue = "5") int id){

        return "user+++"+id;
    }

    @RequestMapping("lists")
    public List<User> lists(){
        return iUserService.list();
    }
}
