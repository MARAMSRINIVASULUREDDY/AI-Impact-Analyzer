package com.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.service.OrderService;

public class OrderTest {

    @Test
    public void testOrder() {
        OrderService service = new OrderService();
        Assert.assertEquals(service.placeOrder("Book"), "Book ordered");
    }
}