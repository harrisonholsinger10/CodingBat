package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class lower
{
    public List<String> lower(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x.toLowerCase())
                        .collect(Collectors.toList());
    }
}
