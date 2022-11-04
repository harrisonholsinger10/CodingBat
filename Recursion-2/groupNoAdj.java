package com.example.demo;

/*
* Given an array of ints, is it possible to choose a group of some of the ints,
* such that the group sums to the given target with this additional constraint:
* If a value in the array is chosen to be in the group,
* the value immediately following it in the array must not be chosen. (No loops needed.)
*/

public class groupNoAdj
{
    public boolean groupNoAdj(int start, int[] nums, int target)
    {
        if (start >= nums.length)
            return (target == 0);

        if (groupNoAdj(start+1, nums, target))
            return true;

        if (groupNoAdj(start+2, nums, target-nums[start]))
            return true;

        return false;
    }
}
