package com.example.demo;

/*
* Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
* You may assume that n is between 0 and the length of the string, inclusive.
*/

public class repeatEnd
{
    public String repeatEnd(String str, int n)
    {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            builder.append(str.substring(str.length()-n));
        }

        return builder.toString();
    }
}
