package org.example.structural.adapter;

public interface IPaymentProvider {
    public String link();

    public String pay(PaymentRequest paymentRequest);

    public PaymentStatus status(String transactionId);
}
