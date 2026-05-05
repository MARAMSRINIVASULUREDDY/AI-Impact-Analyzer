package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.service.LoginService;

public class LoginTest {

    @Test
    public void testLoginSuccess() {
        LoginService service = new LoginService();
        Assert.assertTrue(service.login("admin", "123"));
    }
}