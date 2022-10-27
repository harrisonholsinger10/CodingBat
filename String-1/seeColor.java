package com.example.demo;

public class seeColor
{
    public String seeColor(String str)
    {
        if (str.length() < 3)
        {
            return "";
        }

        if (str.length() == 3)
        {
            return str.equals("red") ? "red" : "";
        }

        if (str.substring(0,3).equals("red"))
        {
            return "red";
        }

        if (str.substring(0,4).equals("blue"))
        {
            return "blue";
        }

        return "";
    }
}
