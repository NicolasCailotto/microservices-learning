package com.nico.microservices.limitsservice.bean;

public class LimitConfiguration {
    private int maximum;
    private int minimum;

    //no-argument constructor
    protected LimitConfiguration() {
    }

    //genetrating constructor using fields
    public LimitConfiguration(int maximum, int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    //generating getters
    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}