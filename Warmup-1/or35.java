package com.example.demo;

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
*/

public class or35
{
    public boolean or35(int n)
    {
        if (n % 3 == 0 || n % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
