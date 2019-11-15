package com.haku.springdata.springdata01.test;

import com.haku.springdata.springdata01.Entity.User;
import com.haku.springdata.springdata01.Springdata01Application;
import com.haku.springdata.springdata01.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@SpringBootTest(classes = {Springdata01Application.class})
@RunWith(SpringRunner.class)
public class TestDemo {
    @Autowired
    UserService userService;

    @Test
    public void test01() {
        User user = new User("jack", "123");
        System.out.println(user);
//
        userService.addUser(user);
//
//        System.out.println(userRe);

    }
}
