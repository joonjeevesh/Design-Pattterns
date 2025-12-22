package org.example.Factory.Notification.FactoryMethod;

import org.example.Factory.Notification.Product.NotificationService;

public interface NotificationFactory {
    public NotificationService create();
}
