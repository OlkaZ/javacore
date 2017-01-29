package com.olkaz.app.classwork.lesson4;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void calculateIfTriangeRightAngle(){
        System.out.println("Please type side A");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Please type side B");
        double b = scanner.nextDouble();

        System.out.println("Please type side C");
        double c = scanner.nextDouble();

        if( ( a*a == (b*b + c*c))
                || (b*b == (a*a + c*c))
                || (c*c == (b*b+c*c))){ System.out.println("This triangle is Right angle");}
         else
        {System.out.println("This triangle is not right angle");}



    }

}
