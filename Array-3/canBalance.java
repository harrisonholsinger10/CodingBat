package com.example.demo;

/*
* Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
* on one side is equal to the sum of the numbers on the other side.
*/
public class canBalance
{
    public boolean canBalance(int[] nums)
    {
        int lSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            lSum += nums[i];
            int rSum = 0;

            for (int j = nums.length-1; j > i; j--)
            {
                rSum += nums[j];
            }
            if (rSum == lSum)
                return true;
        }
        return false;
    }
}
