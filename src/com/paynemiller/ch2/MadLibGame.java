package com.paynemiller.ch2;


import java.util.Scanner;

/**
 * Mad libs are a simple game where you create a story tem- plate with blanks for words. You, or another player, then
 * construct a list of words and place them into the story, creating an often silly or funny story as a result.
 * Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
 * <p>
 * Example Output
 * Enter a noun: dog
 * Enter a verb: walk
 * Enter an adjective: blue
 * Enter an adverb: quickly
 * Do you walk your blue dog quickly? That's hilarious!
 * <p>
 * Constraints
 * • Use a single output statement for this program.
 * • If your language supports string interpolation or string substitution, use it to build up the output.
 * <p>
 * Challenges
 * • Add more inputs to the program to expand the story.
 * • Implement a branching story, where the answers to questions determine how the story is constructed. You’ll explore this concept more in the problems in Chapter
 * 4, Making Decisions, on page 29.
 */
public class MadLibGame {
  public void createGame() {
    MadLib madLib = promptForInput();
    System.out.println(madLib);
  }

  private MadLib promptForInput() {
    Scanner keyboard = new Scanner(System.in);
    String noun = promptForNoun(keyboard);
    String verb = promptForVerb(keyboard);
    String adjective = promptForAdjective(keyboard);
    String adverb = promptForAdverb(keyboard);

    return new MadLib.Builder()
            .setNoun(noun)
            .setVerb(verb)
            .setAdjective(adjective)
            .setAdverb(adverb)
            .build();
  }

  private String promptForNoun(Scanner keyboard) {
    System.out.println("Enter a noun: ");
    return keyboard.nextLine();
  }

  private String promptForVerb(Scanner keyboard) {
    System.out.println("Enter a verb: ");
    return keyboard.nextLine();
  }

  private String promptForAdjective(Scanner keyboard) {
    System.out.println("Enter an adjective: ");
    return keyboard.nextLine();
  }

  private String promptForAdverb(Scanner keyboard) {
    System.out.println("Enter an adverb: ");
    return keyboard.nextLine();
  }

}

class MadLib {
  private String noun;
  private String verb;
  private String adjective;
  private String adverb;

  private MadLib(String noun, String verb, String adjective, String adverb) {
    this.noun = noun;
    this.verb = verb;
    this.adjective = adjective;
    this.adverb = adverb;
  }

  static class Builder {
    private String noun;
    private String verb;
    private String adjective;
    private String adverb;

    public Builder setNoun(String noun) {
      this.noun = noun;
      return this;
    }

    public Builder setVerb(String verb) {
      this.verb = verb;
      return this;
    }

    public Builder setAdjective(String adjective) {
      this.adjective = adjective;
      return this;
    }

    public Builder setAdverb(String adverb) {
      this.adverb = adverb;
      return this;
    }

    public MadLib build() {
      return new MadLib(noun, verb, adjective, adverb);
    }
  }

  @Override
  public String toString() {
    return new StringBuilder()
            .append("Do you ")
            .append(verb)
            .append(" your ")
            .append(adjective)
            .append(" ".concat(noun))
            .append(" ".concat(adverb))
            .append("? That 's hilarious!")
            .toString();
  }
}
