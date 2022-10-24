package com.example.demo;

public class endUp
{
    public String endUp(String str)
    {
        if (str.length() < 3)
        {
            return str.toUpperCase();
        }
        else
        {
            return str.substring(str.length() - str.length(), str.length() - 3) +
                    str.substring(str.length() - 3, str.length()).toUpperCase();
        }
    }
}
