package com.example.demo;

/*
* Given two strings, append them together (known as "concatenation") and return the result. 
* However, if the concatenation creates a double-char, then omit one of the chars, 
* so "abc" and "cat" yields "abcat".
*/

public class conCat
{
    public String conCat(String a, String b)
    {
        if (a.equals(""))
        {
            return b;
        }

        if (b.equals(""))
        {
            return a;
        }

        if (a.charAt(a.length()-1) == b.charAt(0))
        {
            return a + b.substring(1);
        }

        return a + b;
    }
}
