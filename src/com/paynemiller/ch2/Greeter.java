package com.paynemiller.ch2;

/**
 * The “Hello, World” program is the first program you learn
 * to write in many languages, but it doesn’t involve any input.
 *
 * So create a program that prompts for your name and prints a greeting using your name.
 *
 * Example Output
 *        What is your name? Brian
 *        Hello, Brian, nice to meet you!
 *
 * Constraint
 * • Keep the input, string concatenation, and output separate.
 *
 * Challenges TODO: @Erick
 * • Write a new version of the program without using any variables.
 * • Write a version of the program that displays different greetings for different people.
 */

public class Greeter {
  public void sayHello(String name) {
    String greeting = buildGreeting(name);
    System.out.println(greeting);
  }

  private String buildGreeting(String name) {
    return new StringBuilder("Hello, ")
           .append(name)
           .append(", nice to meet you!")
           .toString();
  }
}
