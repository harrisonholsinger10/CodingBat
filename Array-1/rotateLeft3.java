package com.example.demo;

/*
* Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
*/

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
