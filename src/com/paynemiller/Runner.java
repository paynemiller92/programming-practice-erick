package com.paynemiller;

import com.paynemiller.ch2.Calculator;
import com.paynemiller.ch2.CharacterCounter;
import com.paynemiller.ch2.EmptyWordException;
import com.paynemiller.ch3.CurrencyConverter;
import com.paynemiller.ch3.PaintCalculator;
import com.paynemiller.ch3.PizzaDivider;
import com.paynemiller.ch3.SelfCheckout;

import java.util.Scanner;

public class Runner {
  public static void main(String [] args){
    //exercise 10
    SelfCheckout dowork = new SelfCheckout();
    dowork.calculateEverything();
    //exercise 11
    //CurrencyConverter conversion = new CurrencyConverter();
    //conversion.output();
  }
}
