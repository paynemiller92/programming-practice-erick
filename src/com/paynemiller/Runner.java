package com.paynemiller;

import com.paynemiller.ch2.Greeter;

public class Runner {
    public static void main(String[] args) {
        /*
        Greeter greeter = new Greeter();
        greeter.sayHello("Payne");
        greeter.sayHello("Erick");
        */
        Greeter strCount = new Greeter();
        //strCount.stringCounter("Hello");
        System.out.println(strCount.stringCounter("ThisHasTen"));
        System.out.println(strCount.stringCounter("Test 2"));
        System.out.println(strCount.stringCounter(""));


    }
}


