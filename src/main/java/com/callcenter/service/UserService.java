package com.callcenter.service;

import com.callcenter.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/21/13
 * Time: 7:54 AM
 */
@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private static final NavigableMap<Long, User> users = new TreeMap<Long, User>();

    static {
        final User user = new User();
        user.setLogin("blee");
        user.setPassword("!@#$%^&*^%");
        users.put(1L, user);
    }

    @Resource
    private EmailService emailService;

    public List<User> findAll() {
        return Arrays.asList(users.values().toArray(new User[users.values().size()]));
    }

    public User findUser(Long id) {
        return users.get(id);
    }

    public Long save(User user) {

        for (int i = 0; i < 1000; i++) {
            emailService.sendEmail(i);
        }

        Long id;
        if (users.lastEntry() == null) {
            id = 1L;
        } else {
            id = users.lastEntry().getKey() + 1L;
        }

        users.put(id, user);

        LOGGER.info("saved!!!");

        return id;
    }

    public void remove(Long id) {
        users.remove(id);
    }
}
