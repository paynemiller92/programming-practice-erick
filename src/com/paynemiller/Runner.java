package com.paynemiller;

import com.paynemiller.ch3.PaintCalculator;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {
       // PaintCalculator rectangle = new PaintCalculator();
       // rectangle.getPaintNeeded();

        PaintCalculator circle = new PaintCalculator();
        circle.getPaintNeededForCircle();
    }
}
