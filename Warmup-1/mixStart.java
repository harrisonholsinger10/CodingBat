package com.example.demo;

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
