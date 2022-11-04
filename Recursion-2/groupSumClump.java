package com.example.demo;

/*
* Given an array of ints, is it possible to choose a group of some of the ints,
* such that the group sums to the given target, with this additional constraint:
* if there are numbers in the array that are adjacent and the identical value, they must either all be chosen,
* or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2},
* either all three 2's in the middle must be chosen or not, all as a group.
* (one loop can be used to find the extent of the identical values).
*/

public class groupSumClump
{
    public boolean groupSumClump(int start, int[] nums, int target)
    {
        altArray(nums);
        if (start >= nums.length)
            return target == 0;

        if (groupSumClump(start+1, nums, target-nums[start]))
            return true;

        if (groupSumClump(start+1, nums, target))
            return true;

        else
            return false;
    }

    private void altArray(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (i > 0 && nums[i] == nums[i-1])
            {
                nums[i-1] += nums[i];
                if (i+1 < nums.length && nums[i] != nums[i+1])
                    nums[i] = 0;
                else if (i == nums.length-1)
                    nums[i] = 0;
            }
        }
    }

}
