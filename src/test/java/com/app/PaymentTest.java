package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.service.PaymentService;

public class PaymentTest {

    @Test
    public void testPayment() {
        PaymentService service = new PaymentService();
        Assert.assertTrue(service.processPayment(100));
    }
}