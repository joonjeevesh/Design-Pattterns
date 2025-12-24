package org.example.structural.adapter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    private String name;
    private Double amount;
    private String email;
    private String phoneNo;
}
