package com.example.demo;

public class doubleX
{
    boolean doubleX(String str)
    {
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i + 1 >= str.length())
        {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
    }
}
