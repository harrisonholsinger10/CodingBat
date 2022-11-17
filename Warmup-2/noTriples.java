package com.example.demo;

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
Return true if the array does not contain any triples.
*/

public class noTriples
{
    public boolean noTriples(int[] nums)
    {
        int count = 0;

        if (nums.length < 3)
        {
            return true;
        }

        for (int i = 0; i <= nums.length - 3; i ++)
        {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
            {
                count++;
            }
        }
        if (count > 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
