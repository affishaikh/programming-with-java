package com.learning.currency_converter;

public class KuwaitiDinar {
    Double kDinar;

    public KuwaitiDinar() {

    }

    public Double geDinar() {
        return kDinar;
    }

    public void setDinar(Double kDinar) {
        this.kDinar = kDinar;
    }

    public KuwaitiDinar(Double kDinar) {
        this.kDinar = kDinar;
    }

    public Double dinarToAusDollar(Double ausDollar) {
        kDinar = 4.87;
        return kDinar * ausDollar;
    }


    public Double dinarToInr(Double inr) {
        kDinar = 270.52;
        return inr * kDinar;
    }


    public Double dinarToUsd(Double usd) {
        kDinar = 3.26;
        return usd * kDinar;
    }

}