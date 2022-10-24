package com.example.demo;

public class countXX
{
    int countXX(String str)
    {
        int countXX = 0;

        for(int i = 0; i < str.length() - 1; i++)
        {
            if (str.substring(i, i + 2).equalsIgnoreCase("XX"))
            {
                countXX++;
            }
        }
        return countXX;
    }
}
