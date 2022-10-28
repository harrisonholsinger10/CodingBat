package com.example.demo;

public class no23
{
    public boolean no23(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 2 || nums[i] == 3)
            {
                return false;
            }
        }
        return true;
    }
}
