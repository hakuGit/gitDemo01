package com.haku.springdata.springdata01.service;

import com.haku.springdata.springdata01.Entity.User;
import com.haku.springdata.springdata01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User addUser(User user){
      return userDao.save(user);
    }

    public List<User> showAll(){
        return userDao.findAll();
    }
}
