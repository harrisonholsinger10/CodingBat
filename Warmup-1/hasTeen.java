package com.example.demo;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
*/

public class hasTeen
{
    public boolean hasTeen(int a, int b, int c)
    {
        if (a <= 19 && a >= 13 || b <= 19 && b >= 13 || c <= 19 && c >= 13)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
