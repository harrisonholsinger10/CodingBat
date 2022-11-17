package com.example.demo;

/*
* Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
*/

public class sameFirstLast
{
    public boolean sameFirstLast(int[] nums)
    {
        if (nums.length < 1)
            return false;

        return nums.length >= 1 && nums[0] == nums[nums.length-1];
    }

}
