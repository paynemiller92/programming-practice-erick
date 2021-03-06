package com.paynemiller.ch2;

import java.util.Calendar;

/**
 *
 Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure
 out how your programming language can provide you with that information.

 Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for
 your current age and the age you want to retire and display the output as shown in the example that follows.

 Example Output

 What is your current age? 25

 At what age would you like to retire? 65 You have 40 years left until you can retire. It's 2015, so you can retire in 2055.

 Constraints

 • Again, be sure to convert the input to numerical data before doing any math.
 • Don’t hard-code the current year into your program. Get it from the system time via your programming language.

 Challenge

 • Handle situations where the program returns a negative number by stating that the user can already retire.

Place in main for runner:
 RetirementCalculator retirementCalculator = new RetirementCalculator();
 try {
 int retirementYear = retirementCalculator.calculateRetirementYear(promptForAge());
 System.out.println("You can retire in " + retirementYear);
 } catch (EligibleToRetireException e) {
 System.out.println("You can already retire!");
 }

 Place under main in runner:
 private static int promptForAge() {
 Scanner keyboard = new Scanner(System.in);
 System.out.println("Enter your current age and press ENTER!");
 return keyboard.nextInt();
 }

 */

public class RetirementCalculator {
  private static final int RETIREMENT_AGE = 65;

  public int calculateRetirementYear(int currentAge) throws EligibleToRetireException {
    int yearsToRetire = RETIREMENT_AGE - currentAge;
    if (yearsToRetire < 0) {
      throw new EligibleToRetireException();
    }
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return currentYear + yearsToRetire;
  }
}

