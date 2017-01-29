package com.olkaz.app.classwork.lesson4;


import java.util.Scanner;

public class BiggerNumber {
    public static void calculateBiggerNumber() {
            System.out.println("Please enter value 1");
            Scanner scanner = new Scanner(System.in);
            double valueFirst = scanner.nextDouble();
            System.out.println("Please enter value 2");
            double valueSecond = scanner.nextDouble();

            if (valueFirst > valueSecond) {
                System.out.println("Value 1 is bigger then value 2");
            } else {
                if (valueFirst < valueSecond) {
                    System.out.println("Value 1 is smaller then value 2");
                } else {
                    System.out.println("Values are equal");
                }
                }

    }
}
