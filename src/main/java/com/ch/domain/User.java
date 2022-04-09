package com.ch.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author 青梅君
 */
public class User implements Serializable {

    private String username;
    private Double money;
    private Date time;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", time=" + time +
                '}';
    }
}