package com.example.demo;

public class maxEnd3
{
    public int[] maxEnd3(int[] nums)
    {
        if (nums[0] > nums[2])
        {
            nums[1] = nums[0];
            nums[2] = nums[0];
        }
        else
        {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }

        return nums;
    }
}
