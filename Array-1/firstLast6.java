package com.example.demo;

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
