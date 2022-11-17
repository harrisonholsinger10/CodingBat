package com.example.demo;

/*
* Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. 
* The array length will be at least 3.
*/

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
