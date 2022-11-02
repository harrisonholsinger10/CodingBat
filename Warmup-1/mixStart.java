package com.example.demo;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
*/

public class mixStart
{
    public boolean mixStart(String str)
    {
        if (str.length() >= 3 && str.substring(1, 3).equalsIgnoreCase("ix"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
