package com.paynemiller.ch3;
import java.util.Scanner;


/** When working in a global environment, you’ll have to present information in both metric and Imperial units.
 * And you’ll need to know when to do the conversion to ensure the most accurate results.
 Create a program that calculates the area of a room. Prompt the user for the length and width of the room
 in feet. Then display the area in both square feet and square meters.
        Example Output
        What is the length of the room in feet? 15
        What is the width of the room in feet? 20
        You entered dimensions of 15 feet by 20 feet.
        The area is
        300 square feet
        27.871 square meters
        The formula for this conversion is
        m2 = f2 × 0.09290304
        Constraints
        • Keep the calculations separate from the output. • Use a constant to hold the conversion factor.
        Challenges
        • Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed
        if the value entered is not numeric.
        • Create a new version of the program that allows you to choose feet or meters for your inputs.
        • Implement this program as a GUI program that automatically updates the values when any value changes.
 */

public class AreaOfRectangularRoom {
    private int length;
    private int width;

    public void getArea(){
        promptForInput();
        performCalculations(length,width);
    }

    public void performCalculations(int length, int width)  {
        int squareFeet = length * width;
        double squareMeters = squareFeet * 0.09290304;

        System.out.println("The area is");
        System.out.println(squareFeet + " square feet");
        System.out.println(squareMeters + " square meters");
    }

    public void promptForInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        length = Integer.parseInt(keyboard.nextLine());
        System.out.println("What is the width of the room in feet? ");
        width = Integer.parseInt(keyboard.nextLine());
    }
// how/where to put the exception and then what to change since I have the input being converted to an int (parse.Int)

}
