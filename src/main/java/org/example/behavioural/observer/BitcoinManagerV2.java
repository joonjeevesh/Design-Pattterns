package org.example.behavioural.observer;

import org.example.behavioural.observer.interfaces.BitcoinManager;

/*
Observer pattern is used whenever we want to decouple dependencies WHEN
there are multiple reactions to an action
 */
public class BitcoinManagerV2 extends BitcoinManager {
    BitcoinObservable bitcoinObservable;

    public BitcoinManagerV2(BitcoinObservable bitcoinObservable) {
        super();
        this.bitcoinObservable = bitcoinObservable;
    }

    @Override
    public void setPrice(Double price) {
        this.bitcoin.setPrice(price);
        this.bitcoinObservable.notifyChange();
    }
}
