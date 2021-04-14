package com.paynemiller;

import com.paynemiller.ch2.CharcterCounter;
import com.paynemiller.ch2.EscapeCharacters;

public class Runner {
    public static void main(String[] args) {
        /*
        CharcterCounter counter = new CharcterCounter();
        System.out.println(counter.countCharacters("ThisHasTen"));
        System.out.println(counter.countCharacters("Test 2"));
        System.out.println(counter.countCharacters(""));
        */

        EscapeCharacters inserter = new EscapeCharacters();
        System.out.println(inserter.quoteInserter());
        System.out.println();
        System.out.println("Print Arrays:");
        System.out.print(inserter.quoteInserterMod());
    }
}


