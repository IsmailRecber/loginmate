package com.loginpage.loginmate;

import java.util.ArrayList;

public class User {
    protected int userId;
    protected String userName;
    protected String password;
    protected String email;


    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getemail() {
        return email;
    }

}
