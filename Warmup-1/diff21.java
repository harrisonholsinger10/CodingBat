package com.example.demo;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
*/

public class diff21
{
    public int diff21(int n)
    {
        if (n <= 21)
        {
            int diff = 21 - n;
            return diff;
        }
        else
        {
            int diffDbl = (n - 21) * 2;
            return diffDbl;
        }
    }

}
