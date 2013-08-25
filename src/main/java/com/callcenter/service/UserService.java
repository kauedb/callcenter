package com.callcenter.service;

import com.callcenter.domain.User;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 8/21/13
 * Time: 7:54 AM
 */
@Service
public class UserService {

    private static final NavigableMap<Long, User> users = new TreeMap<Long, User>();
    static {
        final User user = new User();
        user.setLogin("blee");
        user.setPassword("!@#$%^&*^%");
        users.put(1L, user);
    }


    public List<User> findAll() {
        return Arrays.asList(users.values().toArray(new User[users.values().size()]));
    }

    public User findUser(Long id) {
        return users.get(id);
    }

    public Long save(User user) {
        final Long id = users.lastEntry().getKey() + 1L;
        users.put(id, user);
        return id;
    }

    public void remove(Long id) {
        users.remove(id);
    }
}
