package com.example.demo;

public class delDel
{
    public String delDel(String str)
    {
        if (str.length() >= 4 && str.substring(1, 4).equalsIgnoreCase("del"))
        {
            return str.substring(0, 1) + str.substring(4);

        }
        else
        {
            return str;
        }
    }
}
