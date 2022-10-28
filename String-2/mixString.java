package com.example.demo;

public class mixString
{
    public String mixString(String a, String b)
    {
        StringBuilder builder = new StringBuilder();
        int count = 0;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++)
        {
            if (i < a.length())
                builder.append(a.charAt(i));

            if (i < b.length())
                builder.append(b.charAt(i));
        }

        return builder.toString();
    }
}
