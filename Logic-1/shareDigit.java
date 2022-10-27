package com.example.demo;

public class shareDigit
{
    public boolean shareDigit(int a, int b)
    {
        return (a/10 == b/10) || (a/10 == b%10) || (a%10 == b/10) || (a%10 == b%10);
    }
}
