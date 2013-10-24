package com.callcenter.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 10/5/13
 * Time: 3:44 PM
 */
public class UserDTO {

    private Long id;

    @NotEmpty
    private String login;

    @NotEmpty
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
