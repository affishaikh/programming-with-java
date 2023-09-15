package com.learning.currency_converter;

public class IndianRupees {
    private Double inr;

    public IndianRupees(double inr) {
        this.inr = inr;
    }

    public Double getInr() {
        return inr;
    }

    public void setInr(Double inr) {
        this.inr = inr;
    }

    public Double inrToUsd(Double usd) {
        inr = 0.012;
        return inr * usd;
    }

    public Double inrToAusDollar(Double ausDollar) {
        inr = 0.018;
        return inr * ausDollar;
    }


    public Double inrToDinar(Double dinar) {
        inr = 0.037;
        return inr * dinar;
    }

}