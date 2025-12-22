package org.example.Factory.Notification.FactoryMethod;

import org.example.Factory.Notification.Product.SmsService;

public class SmsServiceFactory implements NotificationFactory {

    @Override
    public SmsService create() {
        return new SmsService();
    }
}
