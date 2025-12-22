package org.example.Factory;

import org.example.Factory.Notification.FactoryMethod.SmsServiceFactory;
import org.example.Factory.Notification.Product.EmailService;
import org.example.Factory.Notification.Product.NotificationService;
import org.example.Factory.Notification.Product.SmsService;
import org.example.Factory.Notification.SimpleFactory.NotificationServiceFactory;
import org.junit.Assert;
import org.junit.Test;

public class NotificationFactoryTest {

    @Test
    public void simpleFactoryInstanceNotNull() {
        NotificationService notificationService = NotificationServiceFactory.create("email");

        Assert.assertNotNull(notificationService);
        Assert.assertTrue(notificationService instanceof EmailService);
        //notificationService.send("Helloooo!!!");
    }

    @Test
    public void factoryMethodInstanceNotNull() {
        NotificationService notificationService = new SmsServiceFactory().create();

        Assert.assertNotNull(notificationService);
        Assert.assertTrue(notificationService instanceof SmsService);
        //notificationService.send("Helloooo!!!");
    }
}
