package com.example.demo;

/*
Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
*/

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
