package org.example.behavioural.observer;

import org.example.behavioural.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class BitcoinObservable {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange() {
        for (Observer observer : observers) {
            observer.doWhenNotified();
        }
    }
}
