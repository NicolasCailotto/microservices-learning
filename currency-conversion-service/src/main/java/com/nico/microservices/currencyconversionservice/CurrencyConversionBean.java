package com.nico.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int exchangeServicePort;
    private int conversionServicePort;

    //default constructor
    public CurrencyConversionBean() {
    }

    //creating constructor
    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int exchangeServicePort, int conversionServicePort) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.exchangeServicePort = exchangeServicePort;
        this.conversionServicePort = conversionServicePort;
    }

    //creating setters and getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public int getExchangeServicePort() {
        return exchangeServicePort;
    }

    public void setExchangeServicePort(int exchangeServicePort) {
        this.exchangeServicePort = exchangeServicePort;
    }

    public int getConversionServicePort() {
        return conversionServicePort;
    }

    public void setConversionServicePort(int conversionServicePort) {
        this.conversionServicePort = conversionServicePort;
    }
}