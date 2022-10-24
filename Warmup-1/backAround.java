package com.example.demo;

public class backAround
{
    public String backAround(String str)
    {
        String lastLetter = str.substring(str.length() - 1, str.length());
        return (lastLetter + str + lastLetter);
    }

}
