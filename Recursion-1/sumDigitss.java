package com.example.demo;

public class sumDigitss
{
    public int sumDigitss(int n)
    {
        if(n == 0)
            return 0;

        return n % 10 + sumDigitss(n / 10);
    }

}
