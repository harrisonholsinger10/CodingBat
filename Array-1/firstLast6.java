package com.example.demo;

/*
* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
*/

public class firstLast6
{
    public boolean firstLast6(int[] nums)
    {
        if(nums.length == 1 && nums[0] == 6)
            return true;

        if(nums[0] == 6 || nums[nums.length-1] == 6)
            return true;

        return false;
    }
}
