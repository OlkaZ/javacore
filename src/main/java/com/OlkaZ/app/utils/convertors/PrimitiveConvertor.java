package com.OlkaZ.app.utils.convertors;


public class PrimitiveConvertor {
    float float1 = 334.46516551668F;
    char char1 = 45;
    int int1 = -35;

    public void floatToChar () {
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        ;
    }

    public void intToChar (){
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }

    public void charToInt () {
        int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);

    }
}
