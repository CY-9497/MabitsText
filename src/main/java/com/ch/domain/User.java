package com.ch.domain;

import java.io.Serializable;


/**
 * @author 青梅君
 */
public class User implements Serializable {

    private String username;
    private Double money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}