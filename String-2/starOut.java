package com.example.demo;

/*
* Return a version of the given string, where for every star (*) in the string 
* the star and the chars immediately to its left and right are gone. 
* So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
*/

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
