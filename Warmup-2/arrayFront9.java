package com.example.demo;

public class arrayFront9
{
    public boolean arrayFront9(Integer[] nums)
    {
        int count = 0;

        for (int i = 0; i <= nums.length - 1 && i <= 3; i++)
        {
            if (nums[i] == 9) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
