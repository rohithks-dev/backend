package com.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/currencyexchange")
public class CurrencyExchangeController {
    public void sample() {
        System.out.println("Hello World");
    }
}
