package com.callcenter.mvc;

import com.callcenter.domain.User;
import com.callcenter.ejb.UserBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/18/13
 * Time: 11:09 AM
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(mappedName = "java:global/callcenter/UserBeanImpl")
    private UserBean userBean;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> findAll() {
        return userBean.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody User findUser(@PathVariable final Long id) {
        return userBean.findUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestBody final User user) {
        userBean.save(user);

    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody final User user) {
        userBean.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable final Long id) {
        userBean.remove(id);
    }

}
