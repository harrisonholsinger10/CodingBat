package com.example.demo;

/*
* The squirrels in Palo Alto spend most of the day playing. 
* In particular, they play if the temperature is between 60 and 90 (inclusive). 
* Unless it is summer, then the upper limit is 100 instead of 90. 
* Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
*/

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
