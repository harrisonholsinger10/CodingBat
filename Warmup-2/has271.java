package com.example.demo;

public class has271
{
    public boolean has271(int[] nums)
    {
        int count = 0;

        if (nums.length < 3)
        {
            return false;
        }

        for (int i = 0; i <= nums.length - 2; i ++)
        {
            if (nums[i + 1] == (nums[i] + 5) && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)
            {
                count++;
            }
        }
        if (count > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
