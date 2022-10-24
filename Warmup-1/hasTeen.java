package com.example.demo;

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
