package com.karlking.javaspringbootdemo4.dao;

import com.karlking.javaspringbootdemo4.model.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Karlos King", new Date()));
        users.add(new User(2,"Kaydene King", new Date()));
        users.add(new User(3, "Mark Drake", new Date()));
    }


}
