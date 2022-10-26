package com.example.demo;

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
