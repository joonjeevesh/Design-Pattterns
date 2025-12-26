package org.example.behavioural.observer;

import org.example.behavioural.observer.interfaces.Observer;

public class EmailService implements Observer {
    public void send() {
        System.out.println("Sending email");
    }

    @Override
    public void doWhenNotified() {
        this.send();
    }
}
