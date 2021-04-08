package com.paynemiller.ch2;

import java.util.Scanner;

/**
 * Create a program that prompts for an input string and displays output that shows the input string and the number of
 * characters the string contains.
 * Example Output
 * What is the input string? Homer
 * Homer has 5 characters.
 * Constraints
 * • Be sure the output contains the original string.
 * • Use a single output statement to construct the output.
 * • Use a built-in function of the programming language to
 * determine the length of the string.
 * Challenges
 * • If the user enters nothing, state that the user must enter
 * something into the program.
 * • Implement this program using a graphical userinterface
 * and update the character counter every time a key is
 * pressed. If your language doesn’t have a particularly
 * friendly GUI library, try doing this exercise with HTML
 * and JavaScript instead.
 */
public class CharcterCounter {
    public String countCharacters(String word) {
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a string.");
        String input = keyboard.nextLine();
        if (word.length() == 0) {
            return "Nothing was inputted please try again";
        } else {
            for (int i = 0; i < word.length(); i++) {
                counter++;
            }
            return "The word that was inputted was " + word + " and the number of characters it has is " + counter;
        }
    }
}
