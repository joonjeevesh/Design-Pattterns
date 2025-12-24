package org.example.structural.adapter.external;

public class PayUApi {
    public String makeLink() {
        return "PayULink";
    }

    public String createPayment(PayUPaymentRequest paymentRequest) {
        return "transactionId";
    }

    public PayUPaymentStatus getStatus(String transactionId) {
        return PayUPaymentStatus.GOOD;
    }
}
