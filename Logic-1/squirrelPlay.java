package com.example.demo;

public class squirrelPlay
{
    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        if (isSummer)
        {
            if(temp <= 100 && temp >= 60)
            {
                return true;
            }
        }
        else
        {
            if(temp <= 90 && temp >= 60)
            {
                return true;
            }
        }

        return false;
    }

}
