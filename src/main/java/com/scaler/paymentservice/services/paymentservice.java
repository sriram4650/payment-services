package com.scaler.paymentservice.services;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface paymentservice {
    public String generatepaymentlink(Long orderid) throws StripeException, RazorpayException;
}
