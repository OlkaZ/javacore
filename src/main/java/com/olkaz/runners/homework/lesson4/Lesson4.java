package com.olkaz.runners.homework.lesson4;

import com.olkaz.app.classwork.lesson4.*;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 if you want to calculate circle area");
        System.out.println("Please enter 2 if you want to know bigger circle");
        System.out.println("Please enter 3 if you want to know whether triangle is a right angle");
        System.out.println("Please enter 4 if you want to know is entered value is even or odd");
        System.out.println("Please enter 5 if you want to know what number of two is bigger");
        int button = scanner.nextInt();

        switch (button) {
            case 1:
                CircleArea.calculateCircleArea();
                break;
            case 2:
                CalculateBiggerCircle.calculateBiggerCircle();
                break;
            case 3:
                RightAngleTriangle.calculateIfTriangeRightAngle();
                break;
            case 4:
                EvenOrOdd.calculateEvenOrOdd();
                break;
            case 5:
                BiggerNumber.calculateBiggerNumber();
                break;
            case 0:
                break;
            default:
                System.out.println("You have made incorrect code");
        }
    }
}
