package com.example.demo;

/*
* Given a list of integers, return a list where each integer is multiplied with itself.
*/

import java.util.List;
import java.util.stream.Collectors;

public class square
{
    public List<Integer> square(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(n -> n * n)
                        .collect(Collectors.toList());
    }
}
