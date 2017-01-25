package com.olkaz.runners.homework.lesson2;


import com.olkaz.app.homework.lesson2.PrimitiveConvertor;

public class Lesson2Runner {
    public static void main (String args[])
    {
       // NarrowingCasting casting = new NarrowingCasting();
       // casting.narrowing();
       // WideningCasting casting = new WideningCasting();
       // casting.widening();
        float floatVariable = 227.46516551668F;
        char charVariable = 689;
        int intVariable = 598;

        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(floatVariable);
        primitiveConvertor.intToChar(intVariable);
        primitiveConvertor.charToInt(charVariable);

        System.out.println("Input float value is " + floatVariable + ". Output char value is " + charVariable);
        System.out.println("Input int value is " + intVariable + ". Output char value is " + charVariable);
        System.out.println("Input char value is " + charVariable + ". Output int value is " + intVariable);

    };
}
