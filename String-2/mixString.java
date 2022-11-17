package com.example.demo;

/*
* Given two strings, a and b, create a bigger string made of the first char of a, 
* the first char of b, the second char of a, the second char of b, and so on. 
* Any leftover chars go at the end of the result.
*/

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
