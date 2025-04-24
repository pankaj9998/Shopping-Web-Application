package com.ecom.controller;

import com.ecom.service.RazorpayService;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*") // Optional: Allow frontend from different origin
@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private RazorpayService razorpayService;

    @PostMapping("/create-order")
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> data) {
        int amount = (int) data.get("amount");
        String currency = (String) data.get("currency");

        try {
            return razorpayService.createOrder(amount, currency, "receipt_100");
        } catch (RazorpayException e) {
            throw new RuntimeException(e);
        }
    }
}
