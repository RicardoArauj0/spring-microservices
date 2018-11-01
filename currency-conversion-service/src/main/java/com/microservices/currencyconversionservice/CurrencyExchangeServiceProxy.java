package com.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange-service", url="http://localhost:8000") used with URL without Ribbon and Naming Server
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    CurrencyConvertionBean getExchange(@PathVariable("from") String from, @PathVariable("to") String to);
}
