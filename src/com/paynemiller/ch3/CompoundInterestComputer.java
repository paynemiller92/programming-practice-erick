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
        System.out.print("What is the number of times the interest");
        System.out.println();
        System.out.print("is compounded per year? ");
        compoundedPerYear = keyboard.nextInt();
    }

    public void calculateCompoundInterest(){
        compoundInterest =  principalAmount * Math.pow(1 + ((interestRate/100) / compoundedPerYear), (compoundedPerYear* numYears));
    }

    public void showCompoundInterest(){
        System.out.print("$" + principalAmount + " invested at " + interestRate + "% for " + numYears + " years");
        System.out.println(" compounded " + compoundedPerYear + " times per year is $" + ((double)Math.round(compoundInterest * 100) / 100));
    }

    public void performCompoundInterest(){
        promptForInput();
        calculateCompoundInterest();
        showCompoundInterest();
    }
}
