package com.example.demo;

/*
Given three int values, a b c, return the largest.
*/

public class intMax
{
    public int intMax(int a, int b, int c)
    {
        int maxAB = Math.max(a, b);
        int max = Math.max(maxAB, c);

        return max;
    }

}
