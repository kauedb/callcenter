package com.callcenter.ejb;

import com.callcenter.domain.User;
import com.callcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.List;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 9/25/13
 * Time: 3:47 PM
 */
@Stateless
@Remote(UserBean.class)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class UserBeanImpl implements UserBean {

    @Autowired
    private UserService userService;

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public User findUser(Long id) {
        return userService.findUser(id);
    }

    @Override
    public Long save(User user) {
        return userService.save(user);
    }

    @Override
    public void remove(Long id) {
        userService.remove(id);
    }

}
