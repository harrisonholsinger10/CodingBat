package com.example.demo;

/*
* Given a list of integers, return a list of those numbers squared and the product added to 10, 
* omitting any of the resulting numbers that end in 5 or 6.
*/

import java.util.List;
import java.util.stream.Collectors;

public class square56
{
    public List<Integer> square56(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(x -> x * x + 10)
                        .filter(x -> x % 10 != 5 && x % 10 != 6)
                        .collect(Collectors.toList());
    }
}
