package com.paynemiller;

import com.paynemiller.ch2.*;
import com.paynemiller.ch3.*;
import com.paynemiller.ch4.PasswordValidator;
import com.paynemiller.ch4.TaxCalculator;

import java.util.Scanner;

public class Runner {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
        gatherInput();
    }

    private static void printMenu() {
        System.out.println("Choose an exercise to demo: ");
        System.out.println("----------------------------");
        for (Exercise exercise : Exercise.values()) {
            System.out.println(exercise.option + ". " + exercise.title);
        }

        int selectedOption = gatherInput();
        switch (selectedOption) {
            case 1:
                startCalculator();
                break;
            case 2:
                startCharacterCounter();
                break;
            case 3:
                startEscapeCharacterPrinter();
                break;
            case 4:
                startRetirementCalculator();
                break;
            case 5:
                startPaintCalculator();
                break;
            case 6:
                startPizzaDivider();
                break;
            case 7:
                startSelfCheckout();
                break;
            case 8:
                startCurrencyConverter();
                break;
            case 9:
                startSimpleInterestComputer();
                break;
            case 10:
                startCompoundInterestComputer();
                break;
            case 11:
                startTaxCalculator();
                break;
            case 12:
                startPasswordValidator();
                break;
        }
    }

    private static int gatherInput() {
        return keyboard.nextInt();
    }

    private static void startCalculator() {
        Calculator calculator = new Calculator();
        calculator.doMath();
    }

    private static void startCharacterCounter() {
        System.out.println("Enter a word!");
        String word = keyboard.nextLine();
        CharacterCounter counter = new CharacterCounter();
        try {
            counter.countCharacters(word);
        } catch (EmptyWordException e) {
            e.printStackTrace();
        }
    }

    private static void startEscapeCharacterPrinter() {
        EscapeCharacters printer = new EscapeCharacters();
        printer.printQuotes();
    }

    private static void startRetirementCalculator() {
        gatherInput();
        RetirementCalculator retirementCalculator = new RetirementCalculator();
        try {
            retirementCalculator.calculateRetirementYear(gatherInput());
        } catch (EligibleToRetireException exception) {
            System.out.print("You can retire");
        }
    }

    private static void startPaintCalculator() {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.calculateArea();
    }

    private static void startPizzaDivider() {
        PizzaDivider divider = new PizzaDivider();
        divider.dividePizza();
    }

    private static void startSelfCheckout() {
        SelfCheckout checkout = new SelfCheckout();
        checkout.calculateEverything();
    }

    private static void startCurrencyConverter() {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.output();
    }

    private static void startSimpleInterestComputer() {
        SimpleInterestComputer simpleInterestComputer = new SimpleInterestComputer();
        simpleInterestComputer.performSimpleInterest();
    }

    private static void startCompoundInterestComputer() {
        CompoundInterestComputer compoundInterestComputer = new CompoundInterestComputer();
        compoundInterestComputer.performCompoundInterest();
    }

    private static void startTaxCalculator() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.performTaxCalculator();
    }

    private static void startPasswordValidator() {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.performPasswordValidatorHash();
    }


    private enum Exercise {

        CALCULATOR("Calculator", 1),
        CHARACTER_COUNTER("Character Counter", 2),
        ESCAPE_CHARACTER_PRINTER("Escape Printer", 3),
        RETIREMENT_CALCULATOR("Retirement Calculator", 4),
        PAINT_CALCULATOR("Paint Calculator", 5),
        PIZZA_DIVIDER("Pizza Divider", 6),
        SELF_CHECKOUT("Self Checkout", 7),
        CURRENCY_CONVERTER("Currency Converter", 8),
        SIMPLE_INTEREST_COMPUTER("Simple Interest Computer", 9),
        COMPOUND_INTEREST_COMPUTER("Compound Interest Computer", 10),
        TAX_CALCULATOR("Tax Calculator", 11),
        PASSWORD_VALIDATOR("Password Validator", 12);

        private String title;
        private int option;

        Exercise(String title, int option) {
            this.title = title;
            this.option = option;
        }
    }
}
