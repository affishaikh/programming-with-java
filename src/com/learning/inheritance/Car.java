package com.learning.inheritance;

public class Car extends Vehicle {

    public Car(String color, String model) {
        super(color, 4, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating your car...!");
        this.speed += 50;
    }

    public void accelerate(Integer accelerationFactor) {
        System.out.println("Accelerating your car...!");
        this.speed += accelerationFactor;
    }
}
