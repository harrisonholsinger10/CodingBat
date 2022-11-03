package com.example.demo;

/*
* Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
* {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
*/

public class squareUp
{
    public int[] squareUp(int n)
    {
        int[] result = new int[n * n];
        int x = n-1, pass = 1, index = 0;

        if (n == 0)
        {
            return result;

        }
        for (int i = n-1; i < result.length; i += n)
        {
            index = i;
            for (int k = 1; k <= pass; k++)
            {
                if (k == 0)
                {
                    break;
                }
                result[index] = k;
                index--;
            }
            pass++;
        }
        return result;
    }
}
