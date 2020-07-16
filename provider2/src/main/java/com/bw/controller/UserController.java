package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("list")
    public String getuse(@RequestParam(defaultValue = "5") int id){
        return "222 user+++"+id;
    }
}
