package com.learning.inheritance;

public class Main {

    public static void applyBreaks(Vehicle vehicle) {
        vehicle.applyBreak();
    }

    public static void main(String[] args) {
        Car car = new Car("black", "honda city");
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate(10);

        Car car2 = new Car("black", "lamborghini");
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();

        Vehicle bike = new Bike("black", "bmw");
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        Bike bike2 = new Bike("black", "FZ");
        bike2.accelerate();
        bike2.accelerate();
        bike2.accelerate();

        Main.applyBreaks(car);
        Main.applyBreaks(bike);
        Main.applyBreaks(bike2);
        Main.applyBreaks(bike2);
    }
}
