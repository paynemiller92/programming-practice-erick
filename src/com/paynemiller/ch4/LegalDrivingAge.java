package com.paynemiller.ch4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LegalDrivingAge {
    //Exercise 16
    int age;
    int legalAge = 16;
    String ageChecker;
    String ofAge = "You are old enough to legally drive.";
    String underage = "You are not old enough to legally drive";

    Scanner keyboard = new Scanner(System.in);

    public void promptForAge() {
        try {
            System.out.println("What is your age? ");
            age = keyboard.nextInt();
        } catch (InputMismatchException invalidAge) {
            System.out.print("Please enter a valid age");
        }
        // entering a negative value does not throw the exception... need to fix.
    }

    public void checkAge() {
        ageChecker = (age >= legalAge) ? ofAge : underage;
        System.out.print(ageChecker);
    }

    public void checkIfLegal() {
        promptForAge();
        checkAge();
    }
}
