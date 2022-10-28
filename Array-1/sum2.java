package com.example.demo;

public class sum2
{
    public int sum2(int[] nums)
    {
        if(nums.length < 2)
        {
            if(nums.length == 1)
            {
                return nums[0];
            }
            else
            {
                return 0;
            }
        }

        return nums[0] + nums[1];
    }
}
