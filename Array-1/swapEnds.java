package com.example.demo;

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
