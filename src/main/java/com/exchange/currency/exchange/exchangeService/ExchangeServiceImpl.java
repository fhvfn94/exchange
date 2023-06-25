package com.exchange.currency.exchange.exchangeService;

import com.exchange.currency.exchange.exchangeRep.ExchangeRep;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    private final ExchangeRep exchangeRep;

    public ExchangeServiceImpl(ExchangeRep exchangeRep) {
        this.exchangeRep = exchangeRep;
    }

    @Override
    public String changeFromUSD(String name, Double currency) {
        return exchangeRep.changeFromUSD(name, currency);
    }

    @Override
    public String changeToUSD(String name, Double currency) {
        return exchangeRep.changeToUSD(name, currency);
    }

    @Override
    public String getAllCurrency() {
        return exchangeRep.getAllCurrency();
    }
}
