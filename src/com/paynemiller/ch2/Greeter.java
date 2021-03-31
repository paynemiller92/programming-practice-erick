package com.paynemiller.ch2;

/**
 * The “Hello, World” program is the first program you learn
 * to write in many languages, but it doesn’t involve any input.
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
}
