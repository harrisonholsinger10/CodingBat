package com.example.demo;

public class fizzString
{
    public String fizzString(String str)
    {
        if (str.length() == 1)
        {
            if (str.charAt(0) == 'f')
            {
                return "Fizz";
            }
            else if (str.charAt(str.length() - 1) == 'b')
            {
                return "Buzz";
            }
        }
        else
        {
            if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
            {
                return "FizzBuzz";
            }

            if (str.charAt(0) == 'f')
            {
                return "Fizz";
            }
            else if (str.charAt(str.length() - 1) == 'b')
            {
                return "Buzz";
            }
        }

        return str;
    }
}
