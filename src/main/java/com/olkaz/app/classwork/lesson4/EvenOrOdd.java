package com.olkaz.app.classwork.lesson4;


import java.util.Scanner;

public class EvenOrOdd {
    public static void calculateEvenOrOdd(){
        System.out.println("Type value to be checked ");
        Scanner scanner = new Scanner(System.in);

        double inputValue = scanner.nextDouble();

        if (inputValue % 2 == 0) {
            System.out.print( "You type " + inputValue + " and it is even" );
        }
        else {System.out.print( "You type " + inputValue + " and it is odd" );}


    }
}
