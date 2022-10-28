package com.example.demo;

public class frontPiece
{
    public int[] frontPiece(int[] nums)
    {
        int arrSize = 2;
        if (nums.length == 0)
        {
            int[] newArr = new int[0];
            return newArr;
        }
        if (nums.length <= 2 && nums.length != 0)
        {
            arrSize = nums.length;
        }
        int[] newArr = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            newArr[i] = nums[i];
        }
        return newArr;
    }
}
