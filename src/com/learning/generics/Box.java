package com.learning.generics;

import com.learning.inheritance.Car;

public class Box <T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Car> box = new Box<>(new Car("red", "bmw"));

        Car c = box.getItem();
    }
}
