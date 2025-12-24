package org.example.structural.adapter;

import org.example.structural.adapter.external.PayUApi;
import org.example.structural.adapter.external.PayUPaymentRequest;
import org.example.structural.adapter.external.PayUPaymentStatus;

public class PayUPaymentProvider implements IPaymentProvider {

    PayUApi api = new PayUApi();

    @Override
    public String link() {
        return api.makeLink();
    }

    @Override
    public String pay(PaymentRequest paymentRequest) {
        return api.createPayment(toPayUPaymentRequest(paymentRequest));
    }

    private PayUPaymentRequest toPayUPaymentRequest(PaymentRequest paymentRequest) {
        return PayUPaymentRequest.builder()
                .email(paymentRequest.getEmail())
                .name(paymentRequest.getName())
                .amount(paymentRequest.getAmount())
                .phoneNo(paymentRequest.getPhoneNo())
                .build();
    }

    @Override
    public PaymentStatus status(String transactionId) {
        return toPaymentStatus(api.getStatus(transactionId));
    }

    private PaymentStatus toPaymentStatus(PayUPaymentStatus status) {
        if(status == PayUPaymentStatus.BAD) {
            return PaymentStatus.ERROR;
        }

        return PaymentStatus.OK;
    }
}
