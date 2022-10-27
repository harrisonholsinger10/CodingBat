package com.example.demo;

public class middleTwo
{
    public String middleTwo(String str)
    {
        int midIndex = (str.length() / 2) - 1;
        return str.substring(midIndex, midIndex + 2);
    }
}
