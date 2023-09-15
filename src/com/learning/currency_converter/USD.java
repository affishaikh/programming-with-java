package com.learning.currency_converter;

public class USD {
    private Double usDollar;

    public USD(Double dollar) {
        this.usDollar = dollar;
    }

    public Double getUsDollar() {
        return usDollar;
    }

    public void setUsDollar(Double usDollar) {
        this.usDollar = usDollar;
    }

    public Double usdToRupee(Double inr) {
        usDollar = 82.75;
        return inr * usDollar;
    }

    public Double usdToAusDollar(Double ausDollar) {
        usDollar = 0.67;
        return usDollar * ausDollar;
    }


    public Double usdToKuwaitiDinar(Double dinar) {
        setUsDollar(3.26);
        return usDollar * dinar;
    }

}