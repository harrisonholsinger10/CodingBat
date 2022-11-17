package com.example.demo;

/*
* Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
* Return the array which has the largest sum. In event of a tie, return a.
*/

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
