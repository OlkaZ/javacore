package com.olkaz.app.classwork.lesson4;


import java.util.Scanner;

public class CircleArea {
    public static final double PI=3.14d;
    public static void calculateCircleArea(){
        System.out.println("Type radius of the circle");
        Scanner scanner = new Scanner(System.in);
            double radiusCircle = scanner.nextDouble();
            double circleArea = PI * radiusCircle * radiusCircle;

        System.out.println("Area of the circle is " + circleArea);
    }
}
