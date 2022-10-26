package com.example.demo;

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
