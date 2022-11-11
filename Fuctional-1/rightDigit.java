package com.example.demo;

/*
* Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
*/

import java.util.List;
import java.util.stream.Collectors;

public class rightDigit
{
    public List<Integer> rightDigit(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(x -> x % 10)
                        .collect(Collectors.toList());
    }
}
