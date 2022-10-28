package com.example.demo;

public class makeMiddle
{
    public int[] makeMiddle(int[] nums)
    {
        int middle = nums.length / 2 - 1;

        int[] arr = new int[2];
        arr[0] = nums[middle];
        arr[1] = nums[middle+1];
        return arr;
    }
}
