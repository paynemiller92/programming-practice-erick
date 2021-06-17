package com.paynemiller.ch3;

import java.util.Scanner;

public class SimpleInterestComputer {
    Scanner keyboard = new Scanner(System.in);
    double principalAmount;
    double rateOfInterest;
    int numYears;
    double simpleInterest;

    public void promptForInput() {
        System.out.print("Enter the principal: ");
        principalAmount = keyboard.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rateOfInterest = keyboard.nextDouble();
        System.out.print("Enter the number of years: ");
        numYears = keyboard.nextInt();
    }

    public void calculateSimpleInterest() {
        rateOfInterest = rateOfInterest / 100;
        simpleInterest = principalAmount * (1 + (rateOfInterest * numYears));
        simpleInterest = Math.round(simpleInterest * 100.0) / 100.0; // rounds to the next decimal
    }

    public void showSimpleInterest() {
        System.out.print("After " + numYears + " years at " + rateOfInterest * 100 + "%, the investment will be worth $" + simpleInterest);
    }

    public void performSimpleInterest() {
        promptForInput();
        calculateSimpleInterest();
        showSimpleInterest();
    }
}
