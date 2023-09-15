package com.learning.currency_converter;

import com.learning.currency_converter2.currency_converter.IndianRupee;
import com.learning.currency_converter2.currency_converter.InvalidChoiceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("=========Currency Convertor=========\n\n");
        app.firstExecute();
        app.secondExecute();

    }

    private void firstExecute() {
        // This is where the code will go
        int choice = 0;
        boolean choiceIsValid = false;
        while (!choiceIsValid) {
            try {
                choice = acceptChoice();
                if (choice < 1 || choice > 5) {
                    throw new InvalidChoiceException("Invalid choice");
                }
                choiceIsValid = true;
            } catch (InvalidChoiceException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        firstDenomination(choice);
    }

    private void firstDenomination(int choice) {
        Main app = new Main();
        switch (choice) {
            case 1 -> {
                USD usd = new USD(getAmount());
                app.secondExecute();
            }
            case 2 -> {
                AustralianDollar aud = new AustralianDollar(getAmount());
                app.secondExecute();

            }
            case 3 -> {
                IndianRupee inr = new IndianRupee(getAmount());
                app.secondExecute();
            }
            case 4 -> {
                KuwaitiDinar kwd = new KuwaitiDinar(getAmount());
                app.secondExecute();
            }
            case 5->{
                System.out.println("Exiting the application");
                break;
            }
            default -> System.out.println("Any Choice!");

        }
    }

    private void secondDenomination(int choice) {
//        switch (choice) {
        /* default -> */
        System.out.println("Program is running successfully");
//        }

    }

    private void secondExecute() {
        // This is where the code will go
        int choice = 0;
        boolean choiceIsValid = false;
        while (!choiceIsValid) {
            try {
                choice = acceptChoice();
                if (choice < 1 || choice > 5) {
                    throw new InvalidChoiceException("Invalid choice");
                }
                choiceIsValid = true;
            } catch (InvalidChoiceException e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
        }
        secondDenomination(choice);
    }

    public int acceptChoice() {
        Scanner sc = new Scanner(System.in);
        boolean allIsWell = false;
        int choice = 0;
        while (!allIsWell) {
            try {
                System.out.println("1. Australian Dollar");
                System.out.println("2. US Dollar");
                System.out.println("3. Indian Rupee");
                System.out.println("4. Kuwaiti Dinar");
                System.out.println("5. Exit");

                System.out.println("Enter the Denomination:");
                choice = sc.nextInt();
                allIsWell = true;
            } catch (InputMismatchException ime) {
                System.out.println("Enter only number value");
                sc.next();
            }
        }
        return choice;
    }

    public Double getAmount() {
        System.out.print("Enter the Amount : ");
        return new Scanner(System.in).nextDouble();
    }

}