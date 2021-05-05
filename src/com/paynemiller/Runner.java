package com.paynemiller;

import com.paynemiller.ch2.Calculator;
import com.paynemiller.ch2.CharacterCounter;
import com.paynemiller.ch2.EmptyWordException;

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
      case 2: startCharacterCounter();
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
      e.printStackTrace(); // TODO: Gracefully handle exception.
    }
  }

  private enum Exercise {

    CALCULATOR("Calculator", 1),
    CHARACTER_COUNTER("Character Counter", 2),
    ESCAPE_CHARACTER_PRINTER("Escape Printer", 3),
    QUOTER("Quoter", 4),
    RETIREMENT_CALCULATOR("Retirement Calculator", 5);

    private String title;
    private int option;

    Exercise(String title, int option) {
      this.title = title;
      this.option = option;
    }
  }
}
