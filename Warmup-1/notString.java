package com.example.demo;

public class notString
{
    public String notString(String str)
    {
        if(str.length() > 3)
        {
            if (str.substring(0, 3).equals("not"))
            {
                return str;
            }
        }
        else
        {
            if (str.equals("not"))
            {
                return str;
            }
        }
        return ("not " + str);
    }
}
