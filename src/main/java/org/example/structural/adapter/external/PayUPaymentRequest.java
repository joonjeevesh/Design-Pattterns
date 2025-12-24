package org.example.structural.adapter.external;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PayUPaymentRequest {
    private String name;
    private Double amount;
    private String email;
    private String phoneNo;
}
