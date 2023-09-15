package com.learning.inheritance;

public class Vehicle {
    protected String color;
    protected Integer wheels;
    protected String model;
    protected Integer speed;

    public Vehicle(String color, Integer wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate() {
        System.out.println("Accelerating...!");
        this.speed += 10;
    }

    public void applyBreak() {
        System.out.println(String.format("Applying breaks on %s...!", this.model));
        this.speed -= 10;
    }
}
