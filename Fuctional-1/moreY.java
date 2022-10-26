package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class moreY
{
    public List<String> moreY(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> "y" + x + "y")
                        .collect(Collectors.toList());
    }
}
