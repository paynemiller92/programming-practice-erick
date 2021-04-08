package com.paynemiller.ch2;

/**
 * Create a program that prompts for an input string and dis- plays output that shows the input string and the number of characters the string contains.
 * <p>
 * Example Output
 * What is the input string? Homer Homer has 5 characters.
 * <p>
 * Constraints
 * • Be sure the output contains the original string.
 * • Use a single output statement to construct the output.
 * • Use a built-in function of the programming language to
 * determine the length of the string.
 * <p>
 * Challenges
 * • If the user enters nothing,state that the user must enter something into the program.
 * • Implement this program using a graphical user interface and update the character counter
 * every time a key is pressed. If your language doesn’t have a particularly friendly GUI
 * library, try doing this exercise with HTML and JavaScript instead.
 */
public class CharacterCounter {
  public int countCharacters(String word) throws EmptyWordException {
    if (word.length() == 0) {
      throw new EmptyWordException("Nothing was inputted please try again") ;
    } else {
      return word.length();
    }
  }
}
