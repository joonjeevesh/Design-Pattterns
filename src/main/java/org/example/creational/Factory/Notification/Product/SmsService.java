package org.example.creational.Factory.Notification.Product;

public class SmsService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending sms: " +  message);
    }
}
