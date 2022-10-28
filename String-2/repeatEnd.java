package com.example.demo;

public class repeatEnd
{
    public String repeatEnd(String str, int n)
    {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            builder.append(str.substring(str.length()-n));
        }

        return builder.toString();
    }
}
