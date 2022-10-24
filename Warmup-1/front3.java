package com.example.demo;

public class front3
{
    public String front3(String str)
    {
        if (str.length() < 3)
        {
            return (str + str + str);
        }
        String firstThreeChars = str.substring(0, 3);
        return (firstThreeChars + firstThreeChars + firstThreeChars);

    }
}
