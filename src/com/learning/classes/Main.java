package com.learning.classes;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM(10000, "dapoli");
        atm.withdraw(100);
        System.out.println(atm.getCash());
        System.out.println(atm.getAddress());
    }
}

/***
 * package - a directory which groups your classes together
 * Should have logical grouping
 */
