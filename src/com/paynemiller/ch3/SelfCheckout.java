package com.paynemiller.ch3;

import java.util.Scanner;

/** Working with multiple inputs and currency can introduce
        some tricky precision issues.
        Create a simple self-checkout system. Prompt for the prices and quantities of three items.
        Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
        Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
        Example Output
        Enter the price of item 1: 25
        Enter the quantity of item 1: 2
        Enter the price of item 2: 10
        Enter the quantity of item 2: 1
        Enter the price of item 3: 4
        Enter the quantity of item 3: 1
        Subtotal: $64.00
        Tax: $3.52
        Total: $67.52
        Constraints
        • Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
        • Be sure you explicitly convert input to numerical data before doing any calculations.
        Challenges
        • Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
        • Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
*/

public class SelfCheckout {
    private double price1;
    private double price2;
    private double price3;

    private int quantity1;
    private int quantity2;
    private int quantity3;

    private double subTotal;
    private double tax;
    private double total;

    Scanner keyboard = new Scanner(System.in);

    public void promptForInput(){
        try {
            System.out.print("Enter the price of item 1: ");
            price1 = keyboard.nextDouble();
            System.out.print("Enter the quantity of item 1: ");
            quantity1 = keyboard.nextInt();
            System.out.print("Enter the price of item 2: ");
            price2 = keyboard.nextDouble();
            System.out.print("Enter the quantity of item 2: ");
            quantity2 = keyboard.nextInt();
            System.out.print("Enter the price of item 3: ");
            price3 = keyboard.nextDouble();
            System.out.print("Enter the quantity of item 3: ");
            quantity3 = keyboard.nextInt();
        } catch (NumberFormatException e){
            promptForInput();
            //exception not working... crashes when its not a number instead of throwing the exception
        }
    }

    public void calculateSubtotal(){
        subTotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
    }

    public void calculateTax(){
        tax = subTotal * (5.5/100);
    }

    public void calculateTotal(){
        total = subTotal + tax;
    }

    public void calculateEverything(){
        promptForInput();
        calculateSubtotal();
        calculateTax();
        calculateTotal();
        System.out.print("Subtotal: " + subTotal);
        System.out.println();
        System.out.print("Tax: " + tax);
        System.out.println();
        System.out.print("Total: " + total);
    }
}
