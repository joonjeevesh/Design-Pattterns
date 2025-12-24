package org.example.creational.Factory.Notification.FactoryMethod;

import org.example.creational.Factory.Notification.Product.SmsService;

public class SmsServiceFactory implements NotificationFactory {

    @Override
    public SmsService create() {
        return new SmsService();
    }
}
