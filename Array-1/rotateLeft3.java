package com.example.demo;

public class rotateLeft3
{
    public int[] rotateLeft3(int[] nums)
    {
        int[] result = new int[3];
        result[0] = nums[1];
        result[1] = nums[2];
        result[2] = nums[0];
        return result;
    }
}
