package com.example.demo;

public class withoutEnd2
{
    public String withoutEnd2(String str)
    {
        if (str.length() < 2)
        {
            return "";
        }

        return str.substring(1, str.length()-1);
    }
}
