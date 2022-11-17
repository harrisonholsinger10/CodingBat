package com.example.demo;

/*
* Given a string of any length, return a new string where the last 2 chars, 
* if present, are swapped, so "coding" yields "codign".
*/

public class lastTwo
{
    public String lastTwo(String str)
    {
        return str.length() >= 2 ? str.substring(0, str.length()-2) +
                str.charAt(str.length()-1) + str.charAt(str.length()-2): str;
    }
}
