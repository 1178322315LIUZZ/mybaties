package com.bw.service;

import com.bw.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "user-provider")
public interface UserService {
    @RequestMapping("list")
    String getuse(@RequestParam("id") int id);

    @RequestMapping("lists")
    List<User> lists();
}
