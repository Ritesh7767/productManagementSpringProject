package com.ritesh.service;

import com.ritesh.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void proceedPayment(String user, double amount){
        Payment.proceedPayment(user, amount);
    }
}
