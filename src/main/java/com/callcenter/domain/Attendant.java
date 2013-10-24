package com.callcenter.domain;

/**
 * callcenter
 * UserBean: Kauê Q. Carbonari
 * Date: 8/24/13
 * Time: 10:13 AM
 */
public class Attendant {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Attendant{");
        sb.append("user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}
