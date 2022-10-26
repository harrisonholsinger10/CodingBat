package com.example.demo;

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
