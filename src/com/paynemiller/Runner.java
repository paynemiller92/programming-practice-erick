package com.paynemiller;

import com.paynemiller.ch2.CharacterCounter;
import com.paynemiller.ch2.EmptyWordException;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a string.");
        String input = keyboard.nextLine();

        try {
            int numberOfCharacters = counter.countCharacters(input);
            System.out.println("The word that was inputted was " + input + " and the number of characters it has is "
                    + numberOfCharacters);
        } catch (EmptyWordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}


