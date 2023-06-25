package com.exchange.currency.exchange.exchangeController;

import com.exchange.currency.exchange.exchangeService.ExchangeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    private final ExchangeService exchangeService;

    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping("changeFromUSD/{name}/{currency}")
    public String changeFromUSD(@PathVariable("name") String name, @PathVariable("currency")Double currency) {
        return exchangeService.changeFromUSD(name, currency);
    }

    @GetMapping("changeToUSD/{name}/{currency}")
    public String changeToUSD(@PathVariable("name") String name, @PathVariable("currency")Double currency) {
        return exchangeService.changeToUSD(name, currency);
    }
    @GetMapping("getAllCurrency")
    public String getAllCurrency() {
        return exchangeService.getAllCurrency();
    }
}
