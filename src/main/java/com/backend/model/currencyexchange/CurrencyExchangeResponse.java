package com.backend.model.currencyexchange;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CurrencyExchangeResponse {
    private Double rate;
    private Double convertedAmount;
    private String from;
    private String to;
    private LocalDateTime conversionTime;
}
