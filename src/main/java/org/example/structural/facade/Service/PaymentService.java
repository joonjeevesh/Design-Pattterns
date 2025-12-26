package org.example.structural.facade.Service;

public class PaymentService {
    public String generateLink() {
        return "id";
    }

    public void pay(String id) {
        System.out.println("Payment done for id: " + id);
    }
}
