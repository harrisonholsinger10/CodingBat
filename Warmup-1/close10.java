package com.example.demo;

public class close10
{
    public int close10(int a, int b)
    {
        int diff1 = 10 - a;
        int diff2 = 10 - b;

        if (Math.abs(diff1) < Math.abs(diff2))
        {
            return a;
        }
        else if (Math.abs(diff2) < Math.abs(diff1))
        {
            return b;
        }
        else
        {
            return 10;
        }
    }

}
