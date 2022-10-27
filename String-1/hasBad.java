package com.example.demo;

public class hasBad
{
    public boolean hasBad(String str)
    {
        if (str.length() < 3)
        {
            return false;
        }

        if (str.length() == 3)
        {
            if (str.equals("bad"))
            {
                return true;
            }
        }
        else
        {
            if (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))
            {
                return true;
            }
        }
        return false;
    }
}
