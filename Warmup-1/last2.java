package com.example.demo;

public class last2
{
    public int last2(String str)
    {
        int result = 0;

        for(int i = 0; i < str.length() - 2; i++)
        {
            if (str.substring(i, i + 2).equalsIgnoreCase(str.substring(str.length() - 2, str.length())))
            {
                result++;
            }
        }
        return result;
    }
}
