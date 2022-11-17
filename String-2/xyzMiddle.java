package com.example.demo;

/*
* Given a string, does "xyz" appear in the middle of the string? To define middle, 
* we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
* This problem is harder than it looks.
*/

public class xyzMiddle
{
    public boolean xyzMiddle(String str)
    {
        int middle = str.length() / 2;
        for(int i = 0; i < str.length()-2; i++)
        {
            if (1 >= (Math.abs(str.substring(i+3).length()-str.substring(0, i).length())))
            {
                if (str.substring(i, i+3).equals("xyz"))
                {
                    return true;
                }
            }
        }

        return false;
    }
}
