package com.example.demo;

/*
* Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
* Return the number of clumps in the given array.
*/

public class countClumps
{
    public int countClumps(int[] nums)
    {
        boolean match = false;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i+1] && !match)
            {
                match = true;
                count++;
            }
            else if (nums[i] != nums[i + 1])
            {
                match = false;
            }
        }
        return count;
    }
}
