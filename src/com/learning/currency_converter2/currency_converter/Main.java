package com.learning.currency_converter2.currency_converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("=========Currency Convertor=========\n\n");

        while (true) {
            int currencyChoice = app.getChoice();
            if (currencyChoice == 5) {
                break;
            }
            Double amount = app.getAmount();
            Currency currentCurrency = app.getCurrencyFor(currencyChoice, amount);
            int requiredCurrencyChoice = app.getChoice();
            Currency requiredCurrency = app.convert(currentCurrency, requiredCurrencyChoice);

            System.out.println(requiredCurrency);
        }
    }

    private Currency getCurrencyFor(int choice, Double amount) {
        switch (choice) {
            case 1 -> {
                return new AustralianDollar(amount);
            }
            case 2 -> {
                return new USD(amount);
            }
            case 3 -> {
                return new IndianRupee(amount);
            }
            default -> {
                return new KuwaitiDinar(amount);
            }
        }
    }

    public int getChoice() {
        Scanner sc = new Scanner(System.in);
        boolean allIsWell = false;
        int choice = 0;

        while (!allIsWell) {
            System.out.println("1. Australian Dollar");
            System.out.println("2. US Dollar");
            System.out.println("3. Indian Rupee");
            System.out.println("4. Kuwaiti Dinar");
            System.out.println("5. Exit");
            System.out.println("Choose a currency or exit:");

            try {
                choice = sc.nextInt();
                if (choice < 1 || choice > 5) {
                    throw new InvalidChoiceException("Invalid choice");
                }
                allIsWell = true;
            } catch (Exception ime) {
                System.out.println("Ooops! Enter a number between 1 to 5");
            }
        }
        return choice;
    }

    public Double getAmount() {
        System.out.print("Enter the Amount : ");
        return new Scanner(System.in).nextDouble();
    }

    public Currency convert(Currency currentCurrency, int requiredCurrencyChoice) {
        switch (requiredCurrencyChoice) {
            case 1 -> {
                return currentCurrency.toAUD();
            }
            case 2 -> {
                return currentCurrency.toUSD();
            }
            case 3 -> {
                return currentCurrency.toINR();
            }
            default -> {
                return currentCurrency.toKWD();
            }
        }
    }
}
