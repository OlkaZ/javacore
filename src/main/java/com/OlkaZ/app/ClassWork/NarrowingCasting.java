package com.OlkaZ.app.ClassWork;


public class NarrowingCasting {
    int int1=0;
    float float1 = 0.0f;
    double double1 = 3.14159d;

    public void narrowing(){
        float1 = (float) double1;
        System.out.println (float1);
    }
}
