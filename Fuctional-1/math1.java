package com.example.demo;

/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
*/

import java.util.List;
import java.util.stream.Collectors;

public class math1
{
    public List<Integer> math1(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(x -> (x + 1) * 10)
                        .collect(Collectors.toList());
    }
}
