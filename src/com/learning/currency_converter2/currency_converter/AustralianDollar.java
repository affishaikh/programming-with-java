package com.learning.currency_converter2.currency_converter;

public class AustralianDollar implements Currency {
    Double value;

    public AustralianDollar(Double ausDollar) {
        this.value = ausDollar;
    }

    public Double getAusDollar() {
        return value;
    }

    public void setAusDollar(Double aud) {
        this.value = aud;
    }

    @Override
    public USD toUSD() {
        return new USD(this.value * 1.49);
    }

    @Override
    public IndianRupee toINR() {
        return new IndianRupee(this.value * 55.59);
    }

    @Override
    public KuwaitiDinar toKWD() {
        return new KuwaitiDinar(this.value*0.21);
    }

    @Override
    public AustralianDollar toAUD() {return this;}

    @Override
    public String toString() {
        return "AUD " + this.value;
    }
}
