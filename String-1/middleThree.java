package com.example.demo;

/*
* Given a string of odd length, return the string length 3 from its middle, 
* so "Candy" yields "and". The string length will be at least 3.
*/

public class middleThree
{
    public String middleThree(String str)
    {
        if (str.length() == 3)
        {
            return str;
        }

        int middleIndex = (str.length()/2)-1;

        return str.substring(middleIndex, middleIndex + 3);
    }
}
