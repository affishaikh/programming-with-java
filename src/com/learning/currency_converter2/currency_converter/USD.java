package com.learning.currency_converter2.currency_converter;

public class USD implements Currency {
    private Double value;
    public USD(Double dollar) {
        this.value = dollar;
    }

    public Double getUsDollar() {
        return value;
    }

    public void setUsDollar(Double usDollar) {
        this.value = usDollar;
    }

    @Override
    public IndianRupee toINR() {
        return new IndianRupee(this.value * 82.86);
    }

    @Override
    public AustralianDollar toAUD() {
        return new AustralianDollar(this.value * 0.27);
    }

    @Override
    public KuwaitiDinar toKWD() {
        return new KuwaitiDinar(this.value * 3.26);
    }

    @Override
    public USD toUSD() {
        return this;
    }

    @Override
    public String toString() {
        return "$ " + this.value;
    }
}

