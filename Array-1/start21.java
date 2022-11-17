package com.example.demo;

/*
* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
*/

public class start21
{
    public int start1(int[] a, int[] b)
    {
        int counter = 0;
        if (a.length != 0)
        {
            if (a[0] == 1)
            {
                counter++;
            }
        }

        if (b.length != 0)
        {
            if (b[0] == 1)
            {
                counter++;
            }
        }

        return counter;
    }
}
