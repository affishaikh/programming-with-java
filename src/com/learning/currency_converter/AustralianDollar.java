package com.learning.currency_converter;

public class AustralianDollar {
    private Double value;

    public AustralianDollar(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public USD toUSD() {
        return new USD(this.value * 0.67);
    }

    public IndianRupees toINR() {
        return new IndianRupees(this.value * 55.59);
    }

    public KuwaitiDinar toDinar() {
        return new KuwaitiDinar(this.value * 0.21);
    }

    public static void main(String[] args) {
        AustralianDollar aud = new AustralianDollar(10.00);

        IndianRupees inr = aud.toINR();
        USD usd = aud.toUSD();
        KuwaitiDinar kd = aud.toDinar();
    }
}
