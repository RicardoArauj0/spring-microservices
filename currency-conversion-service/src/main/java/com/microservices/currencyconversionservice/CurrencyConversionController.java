package com.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("currency-calculation/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConvertionBean getCurrencyConvertion(@PathVariable String from,
                                                        @PathVariable String to,
                                                        @PathVariable BigDecimal quantity) {
        return new CurrencyConvertionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 8000);
    }

}
