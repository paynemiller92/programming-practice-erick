package com.paynemiller.ch2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Quotation marks are often used to denote the start and end of a string. But sometimes we need to
 * print out the quotation marks themselves by using escape characters.
 * Create a program that prompts for a quote and an author. Display the quotation and author as shown
 * in the example output.
 * <p>
 * Example Output
 * <p>
 * What is the quote? These aren't the droids you're looking for. Who said it? Obi-Wan Kenobi
 * Obi-Wan Kenobi says, "These aren't the droids
 * you're looking for."
 * <p>
 * Constraints
 * • Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
 * • If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string
 * concatenation instead.
 * <p>
 * Challenge
 * • In Chapter 7,Data Structures, on page 63, you’ll practice working with lists of data. Modify this program so that instead of
 * prompting for quotes from the user, you create a structure that holds quotes and their associated attributions and
 * then display all of the quotes using the format in the example. An array of maps would be a good choice.
 */

public class EscapeCharacters {
  public void printQuotes() {
    Quote[] quotes = new Quote[]{
            new Quote("Hello", "Erick"),
            new Quote("World", "Payne"),
            new Quote("Exit", "Will")
    };

    for (Quote quote : quotes) {
      System.out.println(quote.print());
    }
  }
}

// Is there a way to keep input in just one string? ( so no quoteInput and authorInput)
// the modified version only prints out the first array. How would I fix this?

class Quote {
  private String text;
  private String author;

  public Quote(String text, String author) {
    this.text = text;
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public String getAuthor() {
    return author;
  }

  public String print() {
    return author.concat(" says, ")
            .concat("\"")
            .concat(text)
            .concat("\"");
  }
}