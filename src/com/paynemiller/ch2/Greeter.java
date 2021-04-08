package com.paynemiller.ch2;

/**
 * The “Hello, World” program is the first program you learn
 * to write in many languages, but it doesn't involve any input.
 * <p>
 * So create a program that prompts for your name and prints a greeting using your name.
 * <p>
 * Example Output
 * What is your name? Brian
 * Hello, Brian, nice to meet you!
 * <p>
 * Constraint
 * • Keep the input, string concatenation, and output separate.
 * <p>
 * Challenges
 * • Write a new version of the program without using any variables.
 * • Write a version of the program that displays different greetings for different people.
 */

public class Greeter {
  public void sayHello(String name) {
    System.out.println(
            new StringBuilder("Hello, ")
                    .append(name)
                    .append(", ")
                    .append(customizeGreeting(name))
                    .toString()
    );
  }

  private String customizeGreeting(String name) {
    switch (name) {
      case "Payne":
        return "nice to meet you!";
      case "Erick":
        return "have a great day!";
      default:
        return "enjoy the ride!";
    }
  }
/**
  Create a program that prompts for an input string and displays output that shows the input string and the number of
  characters the string contains.
  Example Output
  What is the input string? Homer
  Homer has 5 characters.
          Constraints
• Be sure the output contains the original string.
          • Use a single output statement to construct the output.
• Use a built-in function of the programming language to
  determine the length of the string.
  Challenges
• If the user enters nothing, state that the user must enter
  something into the program.
          • Implement this program using a graphical userinterface
  and update the character counter every time a key is
  pressed. If your language doesn’t have a particularly
  friendly GUI library, try doing this exercise with HTML
  and JavaScript instead.
 */

  public String stringCounter (String word) {
    int counter = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please input a string.");
    String input = keyboard.nextLine();
    if (word.length() == 0) {
      return "Nothing was inputted please try again";
    }

    else {
      for (int i = 0; i < word.length(); i++) {
        counter++;
      }
      return "The word that was inputted was " + word + " and the number of characters it has is " + counter;
    }
  }
}
