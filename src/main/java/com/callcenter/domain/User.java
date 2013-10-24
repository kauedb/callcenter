package com.callcenter.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/17/13
 * Time: 11:48 PM
 */
@Entity
@Table(name="tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "des_login")
    private String login;

    @Column(name = "des_password")
    private String password;

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
        final StringBuilder sb = new StringBuilder("UserBean{");
        sb.append("login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
