package org.example.Factory.Notification.FactoryMethod;

import org.example.Factory.Notification.Product.EmailService;
import org.example.Factory.Notification.Product.NotificationService;

public class EmailServiceFactory implements NotificationFactory{
    @Override
    public EmailService create() {
        return new EmailService();
    }
}
