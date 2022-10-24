package com.example.demo;

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
