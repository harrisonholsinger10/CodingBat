package com.example.demo;

public class front22
{
    public String front22(String str)
    {
        if (str.length() < 2)
        {
            return str + str + str;
        }
        else
        {
            String firstTwoLetters = str.substring(0, 2);
            return (firstTwoLetters + str + firstTwoLetters);
        }
    }

}
