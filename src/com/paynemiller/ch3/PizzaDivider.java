package com.paynemiller.ch3;

import java.util.Scanner;

public class PizzaDivider {
    private int numberOfPeople;
    private int numberOfPizzas;
    private int numberOfSlices;
    Scanner keyboard = new Scanner(System.in);

    public void dividePizza(){
        promptForPeople();
        promptForPizza();
        promptForSlices();
        getSlicesPerPerson();
    }

    public void promptForPeople(){
        System.out.println("How many people?");
        numberOfPeople = Integer.parseInt(keyboard.nextLine());
    }

    public void promptForPizza(){
        System.out.println("How many pizzas do you have?");
        numberOfPizzas = Integer.parseInt(keyboard.nextLine());
    }

    public void promptForSlices(){
        System.out.println("How many slices does your pizza have?");
        numberOfSlices = Integer.parseInt(keyboard.nextLine());
    }

    public void getSlicesPerPerson(){
        int slicesPerPerson;
        slicesPerPerson = (numberOfSlices * numberOfPizzas) / numberOfPeople;
        int leftoverSlices = (numberOfSlices * numberOfPizzas) % numberOfPeople;
        System.out.println(numberOfPeople + " people with " + numberOfPizzas);
        System.out.println("Each person gets "+ slicesPerPerson + " of pizza.");
        System.out.println("There are " + leftoverSlices + " leftover pieces.");
    }
}
