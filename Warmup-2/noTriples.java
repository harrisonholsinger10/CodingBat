package com.example.demo;

public class noTriples
{
    public boolean noTriples(int[] nums)
    {
        int count = 0;

        if (nums.length < 3)
        {
            return true;
        }

        for (int i = 0; i <= nums.length - 3; i ++)
        {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
            {
                count++;
            }
        }
        if (count > 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
