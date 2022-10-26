package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class addStar
{
    public List<String> addStar(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x + "*")
                        .collect(Collectors.toList());
    }
}
