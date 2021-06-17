package com.paynemiller.ch3;

import java.util.Scanner;

//exercise 13
public class CompoundInterestComputer {
    double principalAmount;
    int numYears;
    double interestRate; // annual rate of interest
    int compoundedPerYear;
    double compoundInterest;
    Scanner keyboard = new Scanner(System.in);

    public void promptForInput(){
        System.out.print("What is the principal amount? ");
        principalAmount = keyboard.nextDouble();
        System.out.print("What is the rate? ");
        interestRate = keyboard.nextDouble();
        System.out.print("What is the number of years? ");
        numYears = keyboard.nextInt();
        System.out.print("What is the number of times the interest %n is compounded per year? ");
        compoundedPerYear = keyboard.nextInt();
    }

    public void calculateCompoundInterest(){
        interestRate = interestRate / 100;
        compoundInterest = Math.pow(principalAmount * (1 + (interestRate / compoundedPerYear)), compoundedPerYear* numYears);
    }

    public void showCompoundInterest(){
        System.out.print("$" + principalAmount + "invested at " + interestRate + "% for " + numYears + " years" +
                "%n compounded " + compoundedPerYear + " times per year is $" + compoundInterest);
    }

    public void performCompoundInterest(){
        promptForInput();
        calculateCompoundInterest();
        showCompoundInterest();
    }
}
