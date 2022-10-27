package com.example.demo;

public class minCat
{
    public String minCat(String a, String b)
    {
        if (a.length() < b.length())
        {
            b = b.substring(b.length() - a.length());
        }
        else if (a.length() > b.length())
        {
            a = a.substring(a.length() - b.length());
        }

        return a + b;
    }
}
