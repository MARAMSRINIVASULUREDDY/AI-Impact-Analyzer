package com.app;

import com.app.service.PaymentService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest {

    @Test
    public void testPayment() {
        PaymentService service = new PaymentService();
        Assert.assertTrue(service.processPayment(100));
    }
}