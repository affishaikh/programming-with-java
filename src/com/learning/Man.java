package com.learning;

import com.learning.access_modifiers.Person;

public class Man extends Person {

    Man(String name, Integer age) {
        super(name, age);
        this.age = 20;
    }
}
