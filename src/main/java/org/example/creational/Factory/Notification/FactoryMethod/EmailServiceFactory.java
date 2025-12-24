package org.example.creational.Factory.Notification.FactoryMethod;

import org.example.creational.Factory.Notification.Product.EmailService;

public class EmailServiceFactory implements NotificationFactory{
    @Override
    public EmailService create() {
        return new EmailService();
    }
}
