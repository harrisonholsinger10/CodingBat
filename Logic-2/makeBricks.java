package com.example.demo;

public class makeBricks
{
    public boolean makeBricks(int small, int big, int goal)
    {
        if(goal > (big*5 + small) ) { //Not enough total
            return false;
        } else {
            return goal % 5 <= small; //Check if there are enough small bricks
        }
    }
}
