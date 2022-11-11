package com.example.demo;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
*/

public class frontTimes
{
    public String frontTimes(String str, int n)
    {
        if (str.length() < 3)
        {
            String result1 = "";
            for (int i = 0; i < n; i++)
            {
                result1 += str;
            }
            return result1;
        }
        else
        {
            String result = "";
            String str3 = str.substring(0, 3);

            for (int i = 0; i < n; i++)
            {
                result += str3;
            }
            return result;
        }

    }
}
