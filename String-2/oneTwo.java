package com.example.demo;

public class oneTwo
{
    public String oneTwo(String str)
    {
        int position = 0;
        StringBuilder builder = new StringBuilder();

        if (str.length() < 3)
            return "";

        if (str.length() == 3)	{
            builder.append(str.charAt(position + 1) + "" + str.charAt(position + 2)
                    + "" + str.charAt(position) + "");

            return builder.toString();
        }
        while (position < str.length()-2)
        {
            builder.append(str.charAt(position + 1) + "" + str.charAt(position + 2)
                    + "" + str.charAt(position) + "");

            position += 3;
        }
        return builder.toString();
    }
}
