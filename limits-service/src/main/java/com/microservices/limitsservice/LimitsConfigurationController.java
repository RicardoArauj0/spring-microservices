package com.microservices.limitsservice;

import com.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfiguration() {
        return new LimitsConfiguration(config.getMaximum(), config.getMinimum());
    }
}
