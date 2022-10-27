package com.example.demo;

public class extraFront
{
    public String extraFront(String str)
    {
        if (str.length() < 3)
        {
            return str + str + str;
        }

        String front = str.substring(0, 2);
        return front + front + front;
    }
}
