package com.example.demo;

/*
* Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
* are forbidden, so in that case just return 20.
*/

public class sortaSum
{
    public int sortaSum(int a, int b)
    {
        int sum = a + b;

        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

}
