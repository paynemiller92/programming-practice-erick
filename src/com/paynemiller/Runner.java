package com.paynemiller;
import com.paynemiller.ch2.CharcterCounter;

public class Runner {
    public static void main(String[] args) {
        CharcterCounter counter = new CharcterCounter();

        System.out.println(counter.countCharacters("ThisHasTen"));
        System.out.println(counter.countCharacters("Test 2"));
        System.out.println(counter.countCharacters(""));


    }
}


