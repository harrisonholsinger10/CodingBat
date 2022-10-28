package com.example.demo;

public class maxTriple
{
    public int maxTriple(int[] nums)
    {
        int middle = nums.length/2;

        int largest = 0;
        if (nums[0] > nums[middle])
        {
            largest = nums[0];
        }
        else
        {
            largest = nums[middle];
        }

        if (largest < nums[nums.length-1])
        {
            largest = nums[nums.length-1];
        }
        return largest;
    }
}
