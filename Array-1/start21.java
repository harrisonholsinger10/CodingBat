package com.example.demo;

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
