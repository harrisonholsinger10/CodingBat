package com.example.demo;

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
