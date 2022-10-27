package com.example.demo;

public class blueTicket
{
    public int blueTicket(int a, int b, int c)
    {
        if (a + b == 10 || b + c == 10 || a + c == 10)
            return 10;

        int abSum = a + b;

        if ((abSum - (b+c) >= 10) || (abSum - (a+c) >= 10))
            return 5;

        return 0;
    }
}
