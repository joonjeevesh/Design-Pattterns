package org.example.behavioural.observer;

public class Runner {
    public static void main(String[] args) {
        BitcoinObservable bitcoinObservable = new BitcoinObservable();
        bitcoinObservable.register(new EmailService());
        bitcoinObservable.register(new SlackService());

        BitcoinManagerV2 bitcoinManager = new BitcoinManagerV2(bitcoinObservable);

        bitcoinManager.setPrice(100.0);
    }
}
