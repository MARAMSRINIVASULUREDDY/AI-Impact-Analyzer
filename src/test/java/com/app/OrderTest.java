package com.app;

import com.app.service.OrderService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest {

    @Test
    public void testOrder() {
        OrderService service = new OrderService();
        Assert.assertEquals(service.placeOrder("Book"), "Book ordered");
    }
}