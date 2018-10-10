package com.microservices.limitsservice.bean;

public class LimitsConfiguration {

    private int maximum;
    private int minimun;

    protected LimitsConfiguration() {}

    public LimitsConfiguration(int maximum, int minimun) {
        super();
        this.maximum = maximum;
        this.minimun = minimun;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimun() {
        return minimun;
    }

}
