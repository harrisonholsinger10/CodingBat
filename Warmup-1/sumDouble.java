package com.example.demo;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
*/

public class sumDouble
{
    public int sumDouble(int a, int b) {
        if (a != b)
        {
            int aPlusB = a + b;
            return aPlusB;
        }
        else
        {
            int doubleAB = 2 * (a + b);
            return doubleAB;
        }
    }


}
