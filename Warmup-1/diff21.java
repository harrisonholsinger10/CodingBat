package com.example.demo;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
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
