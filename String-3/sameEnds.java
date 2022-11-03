package com.example.demo;

/*
* Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
* For example, sameEnds("abXab") is "ab".
*/

public class sameEnds
{
    public String sameEnds(String string)
    {
        int len = string.length();
        String fin = "";
        String tmp = "";

        for (int i = 0; i < len; i++)
        {
            tmp += string.charAt(i);
            int tmplen = tmp.length();
            if (i < len / 2 && tmp.equals(string.substring(len - tmplen, len)))
                fin = tmp;
        }
        return fin;
    }
}
