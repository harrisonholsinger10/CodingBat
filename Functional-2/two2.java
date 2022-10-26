package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class two2
{
    public List<Integer> two2(List<Integer> nums)
    {
        return
                nums.stream()
                        .map(x -> x * 2)
                        .filter(x -> x % 10 != 2)
                        .collect(Collectors.toList());
    }

}
