package org.example.structural.adapter;

import org.example.structural.adapter.external.RazorPayApi;
import org.example.structural.adapter.external.RazorPayPaymentStatus;

public class RazorPayPaymentProvider implements IPaymentProvider {

    RazorPayApi api = new RazorPayApi();

    @Override
    public String link() {
        return api.generateLink();
    }

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return api.makePayment(paymentRequest.getEmail(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus status(String transactionId) {
        return toPaymentStatus(api.checkStatus(transactionId));
    }

    private PaymentStatus toPaymentStatus(RazorPayPaymentStatus status) {
        if(status == RazorPayPaymentStatus.FAILURE) {
            return PaymentStatus.ERROR;
        }

        return PaymentStatus.OK;
    }
}
