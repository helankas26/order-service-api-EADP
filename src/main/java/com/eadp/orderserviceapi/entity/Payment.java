package com.eadp.orderserviceapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payId;

    private Date date;
    private double amount;
    private String paymentType;
    private Boolean status;

    @OneToOne
    @JoinColumn(name = "order_id", unique = true)
    private Orders orders;
}
