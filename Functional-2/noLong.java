package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class noLong
{
    public List<String> noLong(List<String> strings)
    {
        return
                strings.stream()
                        .filter(x -> x.length() < 4)
                        .collect(Collectors.toList());
    }
}
