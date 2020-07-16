package com.bw.controller;

import com.bw.entity.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class UserConsomer {
    @Autowired
    RestTemplate restTemplate;
    @Resource
    UserService userService;
    @RequestMapping("get")
    public String getname(@RequestParam(defaultValue = "10") int id){
        return restTemplate.getForObject("http://user-provider/list?id="+id,String.class);
    }
    @RequestMapping("gets")
    public String gent(@RequestParam(defaultValue = "1") int id){
        String getuse = userService.getuse(id);
        System.out.println(getuse);
        return getuse;
    }
    @RequestMapping("getlists")
    public List<User> lisys(){
        return userService.lists();
    }
}
