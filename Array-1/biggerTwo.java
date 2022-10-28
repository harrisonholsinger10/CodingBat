package com.example.demo;

public class biggerTwo
{
    public int[] biggerTwo(int[] a, int[] b)
    {
        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < a.length; i++)
        {
            aSum += a[i];
        }

        for (int i = 0; i < b.length; i++)
        {
            bSum += b[i];
        }

        return aSum >= bSum ? a : b;
    }
}
