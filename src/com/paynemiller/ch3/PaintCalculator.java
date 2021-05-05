package com.paynemiller.ch3;

import java.util.Scanner;

/**
 * Sometimes you have to round up to the next number rather
 * than follow standard rounding rules.
 * Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
 * Example Output
 * You will need to purchase 2 gallons of
 * paint to cover 360 square feet.
 * Remember, you can’t buy a partial gallon of paint. You must round up to the next whole gallon.
 * Constraints
 * • Use a constant to hold the conversion rate.
 * • Ensure that you round up to the next whole number.
 * Challenges
 * • Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 * • Implement support for a round room.
 * • Implement support for an L-shaped room.
 * • Implement a mobile version of this app so it can be used
 * at the hardware store.
 */

public class PaintCalculator {
    private int length;
    private int width;

    private int diameter;
    Scanner keyboard = new Scanner(System.in);


    private enum Area {
        RECTANGLE_AREA("Rectangle Area", 1),
        CIRCLE_AREA("Circle Area", 2);

        private String choice;
        private int option;

        Area(String choice, int option) {
            this.choice = choice;
            this.option = option;
        }
    }

    public void calculateArea() {
        System.out.println("Choose an area to find: ");
        System.out.println("----------------------------");

        for (Area area : Area.values()) {
            System.out.println(area.choice + "." + area.option);
        }

        int selectedOption = gatherInput();
        switch (selectedOption) {
            case 1 -> getPaintNeeded();
            case 2 -> getPaintNeededForCircle();
            default -> System.out.println("Invalid input");
        }
    }

    private int gatherInput() {
        return keyboard.nextInt();
    }

    public void getPaintNeeded() {
        promptForRectangleInput();
        performRectangleCalculations();
        // will need to change depending on what the user will be doing (rectangle, circle, etc.)
    }

    public void getPaintNeededForCircle() {
        promptForCircleInput();
        performCircleCalculations();
        // will need to change depending on what the user will be doing (rectangle, circle, etc.)
    }

    public void promptForRectangleInput() {
        try {
            System.out.println("What is the length of the ceiling in feet? ");
            length = Integer.parseInt(keyboard.nextLine());
            System.out.println("What is the width of the ceiling in feet? ");
            width = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e) {
            promptForRectangleInput();
        }
    }

    public void performRectangleCalculations() {
        double squareFeet = length * width;
        double paintNeeded = Math.ceil(squareFeet / 350);

        System.out.println("You will need to purchase " + (int) paintNeeded + " gallon(s) of");
        System.out.println("paint to cover " + (int) squareFeet + " square feet.");
    }

    public void performCircleCalculations() {
        double squareFeetOfCircle = Math.PI * Math.pow((diameter / 2), 2);
        double paintNeeded = Math.ceil(squareFeetOfCircle / 350);

        System.out.println("You will need to purchase " + (int) paintNeeded + " gallon(s) of");
        System.out.println("paint to cover " + (int) squareFeetOfCircle + " square feet.");
    }

    public void promptForCircleInput() {
        try {
            System.out.println("What is the diameter? ");
            diameter = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException e) {
            promptForCircleInput();
        }
    }
}
