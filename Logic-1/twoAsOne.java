package com.example.demo;

public class twoAsOne
{
    public boolean twoAsOne(int a, int b, int c)
    {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

}
