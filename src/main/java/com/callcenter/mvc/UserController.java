package com.callcenter.mvc;

import com.callcenter.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 8/18/13
 * Time: 11:09 AM
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<User> findAll() {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody User findUser(@PathVariable final Long id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void addUser(@RequestBody final User user) {

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    public void updateUser(@RequestBody final User user) {

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable final Long id) {

    }

}
