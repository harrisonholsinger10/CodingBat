package com.example.demo;

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
