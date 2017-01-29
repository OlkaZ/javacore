package com.olkaz.app.classwork.lesson4;


import java.util.Scanner;

public class CalculateBiggerCircle {
    public static final double PI=3.14d;
    public static void calculateBiggerCircle(){
        System.out.println("Type radius of the first circle");
            Scanner scanner = new Scanner(System.in);
                double radiusFirstCircle = scanner.nextDouble();

        System.out.println("Type radius of the second circle");
                double radiusSecondCircle = scanner.nextDouble();

        double firstCircleArea = PI * radiusFirstCircle * radiusFirstCircle;
        double secondCircleArea = PI * radiusSecondCircle * radiusSecondCircle;

            if ( firstCircleArea > secondCircleArea)
                System.out.println("Area1 is bigger");
            else
                System.out.println("Area2 is bigger");
    }
}
