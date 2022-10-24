package com.example.demo;

public class array123
{
    public boolean array123(int[] nums)
    {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i <= nums.length -1; i++)
        {
            if (nums[i] == 1)
            {
                count1++;
            }
        }

        for (int i = 0; i <= nums.length -1; i++)
        {
            if (nums[i] == 1)
            {
                count2++;
            }
        }

        for (int i = 0; i <= nums.length -1; i++)
        {
            if (nums[i] == 3)
            {
                count3++;
            }
        }

        if (count1 > 0 && count2 > 0 && count3 > 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
