package com.example.demo;

public class roundSum
{
    public int roundSum(int a, int b, int c)
    {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num)
    {
        int rightmost = num % 10;

        if (rightmost >= 5)
        {
            return num + (10-rightmost);
        }
        else
        {
            return num - (rightmost);
        }

    }
}
