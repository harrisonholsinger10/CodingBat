package com.example.demo;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
*/

public class stringSplosion
{
    public String stringSplosion(String str)
    {
        String result = "";

        for (int i = 0; i <= str.length(); i++)
        {
            result += str.substring(0, i);

        }

        return result;
    }
}
