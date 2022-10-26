package com.example.demo;

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
