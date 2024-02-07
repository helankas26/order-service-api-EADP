package com.eadp.orderserviceapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {
    private Date date;
    private double amount;
    private String paymentType;
    private Boolean status;
}
