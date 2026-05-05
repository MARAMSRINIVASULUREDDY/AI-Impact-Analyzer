package com.app.service;

public class LoginService {

    public boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("123");
    }
}