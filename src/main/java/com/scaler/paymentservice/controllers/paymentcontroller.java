package com.scaler.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.scaler.paymentservice.dtos.generatepaymentlinkrequestdto;
import com.scaler.paymentservice.services.paymentservice;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class paymentcontroller {
    private paymentservice paymentService;
    public paymentcontroller(paymentservice paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping()
    public String generatepaymentlink(@RequestBody generatepaymentlinkrequestdto requestdto) throws StripeException, RazorpayException {
        return paymentService.generatepaymentlink(requestdto.getOrderid());

    }
    public void handlewebhookevent(){

    }
}
