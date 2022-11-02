package com.example.demo;

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.
*/

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
