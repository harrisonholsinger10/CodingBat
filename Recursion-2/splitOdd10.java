package com.example.demo;

/*
* Given an array of ints, is it possible to divide the ints into two groups,
* so that the sum of one group is a multiple of 10, and the sum of the other group is odd.
* Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
* and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
*/

public class splitOdd10
{
    public boolean splitOdd10(int[] nums)
    {
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return recArray(nums, index, sum1, sum2);
    }

    private boolean recArray ( int[] nums, int index, int sum1, int sum2 )
    {
        if ( index >= nums.length )
        {
            return (sum1%10 == 0 && sum2%2 !=0) || (sum2%10 == 0 && sum1%2 !=0);
        }

        int value = nums[index];

        return (recArray(nums, index + 1, sum1 + value, sum2) ||
                recArray(nums, index + 1, sum1, sum2 + value));
    }
}
