package org.example.structural.adapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaymentProviderTest {
    private IPaymentProvider rpPaymentProvider;
    private IPaymentProvider payUPaymentProvider;
    private PaymentRequest paymentRequest;

    @Before
    public void setPaymentProvider(){
        payUPaymentProvider = new PayUPaymentProvider();
        rpPaymentProvider = new RazorPayPaymentProvider();
        paymentRequest = PaymentRequest.builder()
                .email("a@a")
                .name("a")
                .amount(100.0)
                .phoneNo("9999")
                .build();
    }

    @Test
    public void payUpaymentProviderLinkSuccess() {
        String link = payUPaymentProvider.link();
        payUPaymentProvider.pay(paymentRequest);
        Assert.assertEquals("PayULink", link);
    }

    @Test
    public void rpPaymentProviderLinkSuccess() {
        String link = rpPaymentProvider.link();
        rpPaymentProvider.pay(paymentRequest);
        Assert.assertEquals("RpLink", link);
    }
}
