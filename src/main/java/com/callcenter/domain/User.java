package com.callcenter.domain;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 8/17/13
 * Time: 11:48 PM
 */
public class User {

    private String name;
    private String login;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return String.format("User{name='%s', login='%s', password='%s'} %s", name, login, password, super.toString());
    }
}
