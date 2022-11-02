package com.example.demo;

/*
Given a string, return a new string where the first and last chars have been exchanged.
*/

public class frontBack
{
    public String frontBack(String str)
    {
        if (str.length() <= 1) return str;

        char ch[] = str.toCharArray();
        char temp = ch[0];
        ch[0] = ch[str.length() - 1];
        ch[str.length() - 1] = temp;
        String str1 = String.copyValueOf(ch);
        return str1;
    }


}
