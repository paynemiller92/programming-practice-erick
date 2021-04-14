package com.paynemiller.ch2;

import java.util.Scanner;

/** Create a program that prompts for a quote and an author.
    Display the quotation and author as shown in the example output.

    In Chapter7,DataStructures,on page 63, you’ll practice working with lists of data.
    Modify this program so that instead of prompting for quotes from the user, you create
    a structure that holds quotes and their associated attributions and then display all
    of the quotes using the format in the example. An array of maps would be a good choice.
*/

public class EscapeCharacters {
    public String quoteInserter(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quoteInput = keyboard.nextLine();
        System.out.println("Who said it?");
        String authorInput = keyboard.nextLine();
        return authorInput + " says, " + "\"" + quoteInput + "\"";
    }

    public String quoteInserterMod(){
        String quoteArray [] = new String[]{"Hello", "World", "Exit"};
        String authorsArray [] = new String[]{"Erick", "Payne", "Will"};

        for (int i = 0; i < quoteArray.length; i++){
            for ( int j = 0; j < authorsArray.length; j++){
               //something in here?
            }
            return authorsArray[i] + " says, " + "\"" +quoteArray[i] + "\"";
        }
        //did not know what to put in the next line to get rid of no return error so I just put null
        return null;
    }

// Is there a way to keep input in just one string? ( so no quoteInput and authorInput)
// the modified version only prints out the first array. How would I fix this?
}
