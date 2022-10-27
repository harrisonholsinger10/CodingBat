package com.example.demo;

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
