package com.example.demo;

/*
* Given a string, compute a new string by moving the first char to come after the next two chars, 
* so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
* Ignore any group of fewer than 3 chars at the end.
*/

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
