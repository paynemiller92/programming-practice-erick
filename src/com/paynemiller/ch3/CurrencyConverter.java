package com.paynemiller.ch3;

import java.util.Scanner;

public class CurrencyConverter {
    Scanner keyboard = new Scanner(System.in);
    double amountEuros; // maybe int?
    double exchangeRate;
    double amountUSD;

    public void output(){
        promptForInput();
        doCalculations();
        showCalculations();
    }

    public void promptForInput(){
        System.out.print("How many euros are you exchanging? ");
        amountEuros = keyboard.nextDouble();
        System.out.print("What is the exchange rate? ");
        exchangeRate = keyboard.nextDouble();
    }

    public void doCalculations(){
        amountUSD = amountEuros * exchangeRate;
    }

    public void showCalculations(){
        System.out.print(amountEuros + " euros at an exchange rate of " + exchangeRate + " is " + amountUSD);
    }
}
