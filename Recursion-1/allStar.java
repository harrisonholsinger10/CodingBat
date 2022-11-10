package com.example.demo;

/*
* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
*/

public class allStar
{
    public String allStar(String str)
    {
        if(str.length() <= 1)
            return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
