package com.example.demo;

public class starOut
{
    public String starOut(String str)
    {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            if (i == 0 && str.charAt(i) != '*')
                builder.append(str.charAt(i) + "");

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
                builder.append(str.charAt(i) + "");

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
                builder.deleteCharAt(builder.length()-1);

        }
        return builder.toString();
    }
}
