package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class copies3
{
    public List<String> copies3(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x + x + x)
                        .collect(Collectors.toList());
    }
}
