package com.OlkaZ.app.utils.runners;


import com.OlkaZ.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main (String args[])
    {
       // NarrowingCasting casting = new NarrowingCasting();
       // casting.narrowing();
       // WideningCasting casting = new WideningCasting();
       // casting.widening();
        PrimitiveConvertor castingFloatToChar = new PrimitiveConvertor();
        castingFloatToChar.floatToChar();

        PrimitiveConvertor castingIntToChar = new PrimitiveConvertor();
        castingIntToChar.intToChar();

        PrimitiveConvertor castingCharToInt = new PrimitiveConvertor();
        castingCharToInt.charToInt();

    };
}
