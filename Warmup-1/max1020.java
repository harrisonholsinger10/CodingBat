package com.example.demo;

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
