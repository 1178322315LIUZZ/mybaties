package com.bw.service;

import com.bw.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RongDuanImpl implements UserService{
    @Override
    public String getuse(int id) {
        return "15698";
    }

    @Override
    public List<User> lists() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setPass("第一种熔断");
        users.add(user);
        return users;
    }
}
