package com.example.demo;

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
*/

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
