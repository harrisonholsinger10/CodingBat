package com.example.demo;

public class sameFirstLast
{
    public boolean sameFirstLast(int[] nums)
    {
        if (nums.length < 1)
            return false;

        return nums.length >= 1 && nums[0] == nums[nums.length-1];
    }

}
