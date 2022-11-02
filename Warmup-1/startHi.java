package com.example.demo;

/*
Given a string, return true if the string starts with "hi" and false otherwise.
*/

public class startHi
{
    public boolean startHi(String str)
    {
        if (str.length() < 2)
        {
            return false;
        }
        String firstTwoLetters = str.substring(0, 2);
        if (firstTwoLetters.equalsIgnoreCase("hi"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
