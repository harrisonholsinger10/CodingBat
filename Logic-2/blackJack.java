package com.example.demo;

/*
* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
* Return 0 if they both go over.
*/

public class blackJack
{
    public int blackjack(int a, int b)
    {
        if (a > 21 && b > 21)
        {
            return 0;
        }

        if (a > 21 && b <= 21)
        {
            return b;
        }
        else if (a <= 21 && b > 21)
        {
            return a;
        }

        if (Math.abs(21-a) > Math.abs(21-b))
        {
            return b;
        }
        else if (Math.abs(21-b) > Math.abs(21-a))
        {
            return a;
        }

        return 0;
    }
}
