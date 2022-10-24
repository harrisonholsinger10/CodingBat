package com.example.demo;

public class intMax
{
    public int intMax(int a, int b, int c)
    {
        int maxAB = Math.max(a, b);
        int max = Math.max(maxAB, c);

        return max;
    }

}
