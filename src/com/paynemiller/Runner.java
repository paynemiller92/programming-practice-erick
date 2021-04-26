package com.paynemiller;

import com.paynemiller.ch2.EligibleToRetireException;
import com.paynemiller.ch2.RetirementCalculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        RetirementCalculator retirementCalculator = new RetirementCalculator();
        try {
            int retirementYear = retirementCalculator.calculateRetirementYear(promptForAge());
            System.out.println("You can retire in " + retirementYear);
        } catch (EligibleToRetireException e) {
            System.out.println("You can already retire!");
        }
    }

    private static int promptForAge() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your current age and press ENTER!");
        return keyboard.nextInt();
    }
}
