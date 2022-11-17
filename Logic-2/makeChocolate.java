package com.example.demo;

/*
* We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
* Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
*/

public class makeChocolate
{
    public int makeChocolate(int small, int big, int goal)
    {
        if(goal > small + big * 5)
        {
            return -1;
        }
        else if(goal % 5 <= small)
        {
            int numOfBigBricks = goal/5;

            if(big >= numOfBigBricks)
            {
                return goal - (numOfBigBricks * 5);
            }
            else
            {
                return goal - (big * 5);
            }
        }
        return -1;
    }
}
