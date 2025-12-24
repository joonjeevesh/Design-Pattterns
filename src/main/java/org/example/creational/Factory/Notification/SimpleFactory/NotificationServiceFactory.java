package org.example.creational.Factory.Notification.SimpleFactory;

import org.example.creational.Factory.Notification.Product.EmailService;
import org.example.creational.Factory.Notification.Product.NotificationService;
import org.example.creational.Factory.Notification.Product.SmsService;

/*
Simple factory is a great solution if we have less types and less construction logic
The problem if we have multiple types :
-SRP violation: Whenever construction logic is changed for any class, we will have to make change here
-OCP violation: If type added, open this file
-No reusability: If we want to reuse construction logic, complex
 */
public class NotificationServiceFactory {
    public static NotificationService create(String channel) {
        switch (channel.toUpperCase()) {
            case "EMAIL" :
                return new EmailService();
            case "SMS" :
                return new SmsService();
        }

        throw new IllegalArgumentException("Invalid channel");
    }
}
