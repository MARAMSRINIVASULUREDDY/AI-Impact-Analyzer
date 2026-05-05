package com.app;

import com.app.service.LoginService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testLoginSuccess() {
        LoginService service = new LoginService();
        Assert.assertTrue(service.login("admin", "123"));
    }
}