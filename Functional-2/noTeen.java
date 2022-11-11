package com.example.demo;

/*
* Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
*/

import java.util.List;
import java.util.stream.Collectors;

public class noTeen
{
    public List<Integer> noTeen(List<Integer> nums)
    {
        return
                nums.stream()
                        .filter(x -> x > 19 || x < 13)
                        .collect(Collectors.toList());
    }
}
