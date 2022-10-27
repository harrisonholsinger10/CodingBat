package com.example.demo;

public class withoutX
{
    public String withoutX(String str)
    {
        StringBuilder builder = new StringBuilder();

        if (str.length() <= 1)
        {
            if (str.equals("x"))
            {
                return "";
            }
            return str;
        }
        else if(str.length() == 2)
        {
            if (str.charAt(0) != 'x')
            {
                builder.append(str.charAt(0));
            }
            if (str.charAt(1) != 'x')
            {
                builder.append(str.charAt(1));
            }
        }
        else
        {
            if (str.charAt(0) != 'x')
            {
                builder.append(str.charAt(0));
            }

            builder.append(str.substring(1, str.length()-1));

            if (str.charAt((str.length()-1)) != 'x')
            {
                builder.append(str.substring(str.length()-1));
            }
        }
        return builder.toString();
    }
}
