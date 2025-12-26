package org.example.behavioural.observer;

import org.example.behavioural.observer.interfaces.BitcoinManager;

/*
violates SRP, OCP
 */
public class BitcoinManagerV1 extends BitcoinManager {
    private EmailService emailService;
    private SlackService slackService;

    @Override
    public void setPrice(Double price) {
        this.bitcoin.setPrice(price);
        emailService.send();
        slackService.send();
    }
}
