package com.example.demo;

public class deFront
{
    public String deFront(String str)
    {
        if(str.length() < 2)
        {
            return str;
        }

        StringBuilder builder = new StringBuilder();

        if(str.charAt(0) != 'a')
        {

        }
        else
        {
            builder.append(str.charAt(0));
        }

        if(str.charAt(1) != 'b')
        {

        }
        else
        {
            builder.append(str.charAt(1));
        }

        if (str.length() > 2)
        {
            builder.append(str.substring(2));
        }
        return builder.toString();
    }
}
