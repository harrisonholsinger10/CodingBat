package com.example.demo;

/*
Given an array of ints, return the number of 9's in the array.
*/

import java.util.List;

public class arrayCount9
{
    public int arrayCount9(Integer[] nums)
    {
        int count = 0;

        for (int i = 0; i <= nums.length - 1; i++)
        {
            if (nums[i] == 9)
            {
                count++;
            }
        }
        return count;
    }

    public static int arrayCount9Stream(List<Integer> numbers)
    {
        return
                (int) numbers.stream()
                        .filter(number -> number == 9)
                        .count();
    }
}
