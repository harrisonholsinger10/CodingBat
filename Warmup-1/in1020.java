package com.example.demo;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
*/

public class in1020
{
    public boolean in1020(int a, int b)
    {
        if (a <= 20 && a >= 10 || b <= 20 && b >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
