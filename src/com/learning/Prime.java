package com.learning;

public class Prime {

    public boolean isPrime(long number) {
        boolean result = true;
        long checkTill = Math.round(Math.sqrt(number));
        long base = 2;

        while (result && base <= checkTill) {
            result = number % base != 0;
            base++;
        }

        return result;
    }

    public long nthPrime(Integer n) {
        if (n == 1) return 2;
        int count = 2;
        long result = 3;

        while (count <= n) {
            if (isPrime(result)) {
                count++;
            }
            result += 2;
        }

        return result - 2;
    }

    public static void main(String[] args) {
        System.out.println(new Prime().nthPrime(10001));
    }
}
