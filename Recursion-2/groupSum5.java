package com.example.demo;

/*
* Given an array of ints, is it possible to choose a group of some of the ints,
* such that the group sums to the given target with these additional constraints:
* all multiples of 5 in the array must be included in the group.
* If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
*/

public class groupSum5
{
    public boolean groupSum5(int start, int[] nums, int target)
    {
        if (start >= nums.length) return (target == 0);
        {
            if (groupSum5(start+1, nums, target-nums[start]) && checkOne(start, nums))
                return true;
            if (nums[start] % 5 != 0 && groupSum5(start+1, nums, target))
                return true;

            return false;
        }
    }

    private boolean checkOne(int start, int[] nums)
    {
        if (start == 0)
            return true;

        if (start > 0 && nums[start-1] % 5 == 0 && nums[start] == 1)
            return false;
        else
            return true;
    }
}
