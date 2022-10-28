package com.example.demo;

public class repeatFront
{
    public String repeatFront(String str, int n)
    {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            builder.append(str.substring(0, (n-i)));
        }

        return builder.toString();
    }
}
