package com.example.demo;

/*
* Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
* The original array will be length 1 or more.
*/

public class makeEnds
{
    public int[] makeEnds(int[] nums)
    {
        int[] newArr = new int[2];
        newArr[0] = nums[0];
        newArr[1] = nums[nums.length-1];
        return newArr;
    }
}
