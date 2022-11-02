package com.example.demo;

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
The original string will be length 1 or more.
*/

public class backAround
{
    public String backAround(String str)
    {
        String lastLetter = str.substring(str.length() - 1, str.length());
        return (lastLetter + str + lastLetter);
    }

}
