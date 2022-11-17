package com.example.demo;

/*
* Given three ints, a b c, one of them is small, one is medium and one is large. 
* Return true if the three values are evenly spaced, 
* so the difference between small and medium is the same as the difference between medium and large.
*/

public class evenlySpaced
{
    public boolean evenlySpaced(int a, int b, int c)
    {
        if(a == b && b == c)
        {
            return true;
        }
        if(a == b || a == c || b == c)
        {
            return false;
        }
        return ((Math.abs(a - b) == Math.abs(b - c)) ||
                (Math.abs(a - c) == Math.abs(a - b)) ||
                (Math.abs(c - a) == Math.abs(b - c)));
    }
}
