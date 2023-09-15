package com.learning;

public class Bicycle {
    private String color;
    private Float speed;
    private Integer numberOfGears;

    Bicycle(String color, Integer numberOfGears) {
        this.color = color;
        this.numberOfGears = numberOfGears;
        this.speed = 0.0f;
    }

    public Float getSpeed() {
        return this.speed;
    }
    public void increaseSpeed() {
        this.speed = this.speed + 10;
    }

    public void applyBrakes() {
        this.speed = this.speed - 10;
    }

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle("red", 6);
        Bicycle b2 = new Bicycle("black", 5);
        b2.increaseSpeed();
        b1.increaseSpeed();
        b1.increaseSpeed();
        b1.increaseSpeed();
        System.out.println(b1.speed);
        System.out.println(b2.speed);
        b1.speed = 0.0f;
    }

    @Override
    public String toString() {
        return String.format("{ color=%s, speed=%f, numberOfGears=%d }", this.color, this.speed, this.numberOfGears);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Bicycle b = (Bicycle) obj;
        return this.color.equals(b.color) && this.numberOfGears.equals(b.numberOfGears);
    }
}
