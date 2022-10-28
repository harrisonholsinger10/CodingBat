package com.example.demo;

public class midThree
{
    public int[] midThree(int[] nums)
    {
        int middle = nums.length/2 -1;
        int arr[] = new int[3];
        arr[0] = nums[middle];
        arr[1] = nums[middle + 1];
        arr[2] = nums[middle + 2];
        return arr;
    }
}
