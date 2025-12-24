package org.example.structural.adapter.external;

/*
Mock api's for external apis
 */
public class RazorPayApi {
    public String generateLink() {
        return "RpLink";
    }

    public String makePayment(String email, Double amount) {
        System.out.println("Making payment for: " + email + " via RazorPay");
        return "transactionId";
    }

    public RazorPayPaymentStatus checkStatus(String transactionId) {
        return RazorPayPaymentStatus.SUCCESS;
    }
}
