package com.example.demo;

public class startOz
{
    public String startOz(String str)
    {
        if (str.length() == 0)
        {
            return "";
        }
        else if(str.length() == 1)
        {
            return str;
        }

        if (str.length() >= 2 && str.substring(0, 2).equalsIgnoreCase("oz"))
        {
            return str.substring(0, 2);
        }
        else if (str.substring(0, 1).equalsIgnoreCase("o"))
        {
            return str.substring(0, 1);
        }
        else if (str.substring(1, 2).equalsIgnoreCase("z"))
        {
            return str.substring(1, 2);
        }
        else
        {
            return "";
        }
    }
}
