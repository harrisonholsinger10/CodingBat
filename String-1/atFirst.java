package com.example.demo;

public class atFirst
{
    public String atFirst(String str)
    {
        if (str.length() == 0)
        {
            return "@@";
        }

        if (str.length() == 1)
        {
            return str + "@";
        }

        return str.substring(0,2);
    }
}
