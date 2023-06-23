package com.exchange.currency.exchange.exchangeRep;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
@Repository
public class ExchangeRep {
    private final Map<String, Double> map = new HashMap<>();

    @PostConstruct
    void base() {
        map.put("TNG", 425.0);
        map.put("RUB", 80.0);
        map.put("USD", 1.0);
        map.put("EUR", 0.91);
        map.put("GBP", 0.78);
        map.put("TRY", 24.44);
    }

    public String changeFromUSD(String name, Double currency) {
        if (map.containsKey(name)) {
            Double result = map.get(name) * currency;
            return currency + " USD будет " + result + " " + name;
        }
        return "Нет такой валюты";
    }

    public String changeToUSD(String name, Double currency) {
        if (map.containsKey(name)) {
            Double result = currency / map.get(name);
            return currency + " " + name + " будет " + result + " USD";
        }
        return "Нет такой валюты";
    }
}
