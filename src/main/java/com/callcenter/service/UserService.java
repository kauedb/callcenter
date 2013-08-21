package com.callcenter.service;

import com.callcenter.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 8/21/13
 * Time: 7:54 AM
 */
@Service
public class UserService {


    public List<User> findAll() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public User findUser(Long id) {
        final User user = new User();
        user.setLogin("blee");
        user.setName("Lee");
        user.setPassword("!@#$%^&*^%");
        return user;
    }

    public void save(User user) {

    }

    public void remove(Long id) {

    }
}
