package com.microservices.limitsservice;

import com.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitsConfiguration getLimitsFromConfiguration() {
        return new LimitsConfiguration(1000, 1);
    }
}
