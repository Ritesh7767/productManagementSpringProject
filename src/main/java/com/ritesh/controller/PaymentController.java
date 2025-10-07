package com.ritesh.controller;

import com.ritesh.entity.Payment;
import com.ritesh.service.PaymentService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostConstruct
    public void init(){
        paymentService.proceedPayment("USER", 100000);
        paymentService.proceedPayment("ADMIN", 100000);
    }


}
