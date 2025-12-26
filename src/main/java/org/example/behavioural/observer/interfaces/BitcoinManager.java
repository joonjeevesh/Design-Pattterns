package org.example.behavioural.observer.interfaces;

import org.example.behavioural.observer.models.Bitcoin;

public abstract class BitcoinManager {
    protected Bitcoin bitcoin;
    public BitcoinManager() {
        bitcoin = new Bitcoin(0.0);
    }

    public abstract void setPrice(Double price);
}
