package com.example.demo;

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
