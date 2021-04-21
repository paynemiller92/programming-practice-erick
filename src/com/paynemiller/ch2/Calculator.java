package com.paynemiller.ch2;
import java.util.Scanner;

/** You’ll often write programs that deal with numbers. And depending on the programming
 *  language you use, you’ll have to convert the inputs you get to numerical data types.
    Write a program that prompts for two numbers. Print the sum, difference, product, and quotient
    of those numbers as shown in the example output:
        Example Output
        What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2

        Constraints
        • Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
        • Keep the inputs and outputs separate from the numerical conversions and other processing.
        • Generate a single output statement with line breaks in the appropriate spots.

        Challenges
        • Revise the program to ensure that inputs are entered as numeric values.
        Don’t allow the user to proceed if the value entered is not numeric.
        • Don’t allow the user to enter a negative number.
        • Break the program into functions that do the computations. You’ll explore functions in Chapter 5, Functions,
        on page 45.
        • Implement this program as a GUI program that automatically updates the values when any value changes.
 */

public class Calculator {
    private String firstNumber = null;
    private String secondNumber = null;

    private int first;
    private int second;

    public void doMath () {
        promptForInput();
        convertToInt(firstNumber,secondNumber);
        performCalculations(first, second);
    }

    public void performCalculations(int first, int second){
        int addition = first + second;
        int subtraction = first - second;
        int multiplication = first * second;
        int division = first / second;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

    }

    public void promptForInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the first number? ");
        firstNumber = keyboard.nextLine();
        System.out.println("What is the second number? ");
        secondNumber = keyboard.nextLine();
        }

    public void convertToInt(String firstNumber, String secondNumber) {
        first = Integer.parseInt(firstNumber);
        second = Integer.parseInt(secondNumber);
        }
}
