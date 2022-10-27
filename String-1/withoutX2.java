package com.example.demo;

public class withoutX2
{
    public String withoutX2(String str)
    {
        StringBuilder builder = new StringBuilder();
        if(str.length() == 0)
            return str;

        if (str.length() == 1)
        {
            if (str.charAt(0) != 'x')
                return str;
        }
        else if (str.length() == 2)
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) != 'x')
                {
                    builder.append(str.charAt(i));
                }
            }
        }
        else
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == 'x' && (i == 0 || i == 1))
                {

                }
                else
                {
                    builder.append(str.charAt(i));
                }
            }

        }
        return builder.toString();
    }
}
