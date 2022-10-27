package com.example.demo;

public class comboString
{
    public String comboString(String a, String b)
    {
        if (a.length() > b.length())
        {
            return b + a + b;
        }
        else
        {
            return a + b + a;
        }
    }
}
