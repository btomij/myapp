package com.joe.myapplication.Model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Joe on 2018/2/12.
 */

@Entity
public class user {
    private String phonenumber;
    private String username;
    private String password;
    @Generated(hash = 1817732899)
    public user(String phonenumber, String username, String password) {
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
    }
    @Generated(hash = 591315204)
    public user() {
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
