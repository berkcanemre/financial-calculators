package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Financial Calculators!");
        System.out.println("Please choose a calculator:");
        System.out.println("1 - Mortgage Calculator");
        System.out.println("2 - Future Value Calculator");
        System.out.println("3 - Present Value of Annuity Calculator");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

//Calculator1
        if (choice == 1) {
            System.out.println("\nMortgage Calculator");

            System.out.print("Enter the principal amount ($): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (e.g., 7.625 for 7.625%): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the loan term (years): ");
            int years = scanner.nextInt();

            int numberOfPayments = years * 12;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;

            double monthlyPayment = principal *
                    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                    (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

            double totalInterest = (monthlyPayment * numberOfPayments) - principal;

            System.out.printf("Your monthly payment is: $%.2f\n", monthlyPayment);
            System.out.printf("Your total interest paid over the life of the loan is: $%.2f\n", totalInterest);

//Calculator2
        } else if (choice == 2) {
            System.out.println("\nFuture Value Calculator");

            System.out.print("Enter the deposit amount ($): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (e.g., 1.75 for 1.75%): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            int totalDays = 365 * years;
            double dailyInterestRate = (annualInterestRate / 100) / 365;

            double futureValue = principal * Math.pow(1 + dailyInterestRate, totalDays);
            double totalInterestEarned = futureValue - principal;

            System.out.printf("The future value of your deposit is: $%.2f\n", futureValue);
            System.out.printf("Total interest earned: $%.2f\n", totalInterestEarned);

//Calculator3
        } else if (choice == 3) {
            System.out.println("\nPresent Value of an Ordinary Annuity Calculator");

            System.out.print("Enter the monthly payout amount ($): ");
            double monthlyPayout = scanner.nextDouble();

            System.out.print("Enter the expected annual interest rate (e.g., 2.5 for 2.5%): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter the number of years for payout: ");
            int years = scanner.nextInt();

            int numberOfPayments = years * 12;
            double monthlyInterestRate = (annualInterestRate / 100) / 12;

            double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)) / monthlyInterestRate;

            System.out.printf("You would need to invest: $%.2f today.\n", presentValue);
//Error
        } else {
            System.out.println("Invalid choice. Exiting...");
        }
    }
}