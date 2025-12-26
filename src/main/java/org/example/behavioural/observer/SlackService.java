package org.example.behavioural.observer;

import org.example.behavioural.observer.interfaces.Observer;

public class SlackService implements Observer {
    public void send() {
        System.out.println("Sending message on slack");
    }

    @Override
    public void doWhenNotified() {
        this.send();
    }
}
