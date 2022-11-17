package com.example.demo;

/*
* Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
* such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
* including 0. Note: use .equals() to compare 2 strings.
*/

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
