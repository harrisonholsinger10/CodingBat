package com.example.demo;

/*
Given a list of integers, return a list where each integer is multiplied by 2.
*/

import java.util.List;
import java.util.stream.Collectors;

public class doubling
{
    public List<Integer> doubling(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(n -> n * 2)
                        .collect(Collectors.toList());

    }
}
