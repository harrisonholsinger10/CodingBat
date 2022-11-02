package com.example.demo;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
*/

public class max1020
{
    public int max1020(int a, int b)
    {
        if ((a < 10 || a > 20) && (b < 10 || b > 20))
        {
            return 0;
        }
        if ((a >= 10 && a <= 20) && (b <= 10 || b >= 20))
        {
            return a;
        }
        else if ((b >= 10 && b <= 20) && (a <= 10 || a >= 20))
        {
            return b;
        }
        else
        {
            return Math.max(a, b);
        }
    }

}
