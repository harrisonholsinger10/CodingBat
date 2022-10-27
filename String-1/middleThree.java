package com.example.demo;

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
