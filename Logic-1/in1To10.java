package com.example.demo;

public class in1To10
{
    public boolean in1To10(int n, boolean outsideMode)
    {
        if (outsideMode)
        {
            return (n <= 1 || n >= 10);
        }
        return (n >= 1 && n <= 10);
    }
}
