package com.callcenter.ejb;

import com.callcenter.domain.User;

import java.util.List;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 9/26/13
 * Time: 2:08 PM
 */
public interface UserBean {
    List<User> findAll();

    User findUser(Long id);

    Long save(User user);

    void remove(Long id);
}
