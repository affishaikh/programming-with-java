package com.learning;

public class Sheeps {
    public Boolean[] totalNumberOfShips = {true, true, false, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

    void numberOfShips() {
        int count = 0;
        for (int i = 0; i < totalNumberOfShips.length; i++) {
            if (totalNumberOfShips[i]) { // "available" == "available" -> true
                count++;
            }
        }
        System.out.println("Total Number Of Ships Present In Array =" + count);
    }

    public static void main(String[] args) {
        Sheeps AOS = new Sheeps();
        AOS.numberOfShips();
    }
}

