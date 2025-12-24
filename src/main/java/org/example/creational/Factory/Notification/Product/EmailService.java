package org.example.creational.Factory.Notification.Product;

public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
