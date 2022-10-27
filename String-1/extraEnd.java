package com.example.demo;

public class extraEnd
{
    public String extraEnd(String str)
    {
        String lastThree = str.substring(str.length()-2);
        return lastThree + lastThree + lastThree;
    }
}
