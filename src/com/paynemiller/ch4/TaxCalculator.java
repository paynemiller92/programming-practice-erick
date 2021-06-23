package com.paynemiller.ch4;

import java.util.Scanner;

//exercise 14
public class TaxCalculator {
    Scanner keyboard = new Scanner(System.in);
    double orderAmount;
    String stateInitials;
    double subtotal;
    double tax;
    double total;
//primitive data types / abstract data types
    public void performTaxCalculator() {
        promptForInput();
        if (stateInitials.equalsIgnoreCase("WI")){
            doInStateCalculations();
            showInStateCalculations();
        }
        doOutOfStateCalculations();
        showOutOfStateCalculations();
    }

    public void promptForInput() {
        System.out.print("What is the order amount? ");
        orderAmount = keyboard.nextDouble();
        System.out.print("What is the state? ");
        stateInitials = keyboard.next();
    }

    public void doInStateCalculations() {
        subtotal = orderAmount;
        tax = orderAmount * .055;
        total = subtotal + tax;
    }

    public void doOutOfStateCalculations() {
        total = orderAmount;
    }

    public void showInStateCalculations() {
        System.out.print("The subtotal is $" + subtotal);
        System.out.print(" The tax is $" + tax);
        System.out.print(" The total is $" + total);
    }

    public void showOutOfStateCalculations() {
        System.out.print("The total is $" + total);
    }
}
