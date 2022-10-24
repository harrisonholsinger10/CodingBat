package com.example.demo;

public class everyNth
{
    public String everyNth(String str, int n)
    {
        String result = "";

        for (int i = 0; i < str.length(); i += n)
        {
            result += str.charAt(i);
        }
        return result;
    }
}
