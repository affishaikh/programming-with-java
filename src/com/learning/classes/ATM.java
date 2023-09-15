package com.learning.classes;

/***
 * classes
 * objects
 * this keyword
 * getter/setter
 * access modifiers
 * why private?
 */

public class ATM {
    private long cash;
    private String address;

    public ATM(long cash, String address) {
        this.cash = cash;
        this.address = address;
    }

    public long getCash() {
        return this.cash;
    }

    public String getAddress() {
        return this.address;
    }

    public void withdraw(long amount) {
        if (amount < this.cash) {
            this.cash = this.cash - amount;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000000, "Dange chowk");
        atm.withdraw(10000);
        atm.withdraw(20000);
        atm.withdraw(200);
        atm.withdraw(20000000000L);

        ATM atm1 = new ATM(1000000000, "Shivajinagar");
        atm1.withdraw(10);
        System.out.println(atm.cash);
        System.out.println(atm.address);
        System.out.println(atm1.cash);
    }
}
