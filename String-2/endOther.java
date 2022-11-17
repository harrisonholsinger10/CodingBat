package com.example.demo;

/*
* Given two strings, return true if either of the strings appears at the very end of the other string, 
* ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
* Note: str.toLowerCase() returns the lowercase version of a string.
*/

public class endOther
{
    public boolean endOther(String a, String b)
    {
        String lowA = a.toLowerCase();
        String lowB = b.toLowerCase();

        if (lowA == lowB)
            return true;

        if (lowA.length() > lowB.length())
        {
            return lowA.substring(lowA.length()-lowB.length()).equals(lowB);
        }
        else if (lowA.length() < lowB.length())
        {
            return lowB.substring(lowB.length()-lowA.length()).equals(lowA);
        }

        return false;
    }
}
