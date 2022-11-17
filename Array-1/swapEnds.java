package com.example.demo;

/*
* Given an array of ints, swap the first and last elements in the array. Return the modified array. 
* The array length will be at least 1.
*/

public class swapEnds
{
    public int[] swapEnds(int[] nums)
    {
        int swap = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = swap;
        return nums;
    }
}
