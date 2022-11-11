package com.example.demo;

/*
* Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
*/

import java.util.List;
import java.util.stream.Collectors;

public class no9
{
    public List<Integer> no9(List<Integer> nums)
    {
        return
                nums.stream()
                        .filter(x -> x % 10 != 9)
                        .collect(Collectors.toList());
    }
}
