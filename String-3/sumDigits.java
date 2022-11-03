package com.example.demo;

/*
* Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
* Return 0 if there are no digits in the string.
* (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
* Integer.parseInt(string) converts a string to an int.)
*/

public class sumDigits
{
    public int sumDigits(String str)
    {
        int len = str.length();
        int sum = 0;

        for (int i = 0; i < len; i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                String tmp = str.substring(i, i + 1);
                sum += Integer.parseInt(tmp);
            }
        }
        return sum;
    }
}
