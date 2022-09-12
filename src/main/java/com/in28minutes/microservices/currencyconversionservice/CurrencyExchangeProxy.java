package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// typically we give name of the API we have to call,
// since we are invoking currency-exchange service hence we should mention the application name for that here

// @FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
    // the url that we are calling method definition for that should be defined here
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    //public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
    // here CurrencyExchange class has no access hence we can change to CurrencyConversion

    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
