package com.example.demo;

public class last_Digit
{
    public boolean last_Digit(int a, int b, int c)
    {
        int count = 1;

        if(a % 10 == b % 10)
        {
            count++;
        }

        if(b % 10 == c % 10)
        {
            count++;
        }

        if(a % 10 == c % 10)
        {
            count++;
        }

        return count >= 2;
    }

}
