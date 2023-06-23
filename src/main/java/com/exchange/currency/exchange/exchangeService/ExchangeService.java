package com.exchange.currency.exchange.exchangeService;

public interface ExchangeService {
    String changeFromUSD(String name, Double currency);

    String changeToUSD(String name, Double currency);
}
