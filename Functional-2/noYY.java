package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class noYY
{
    public List<String> noYY(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x + "y")
                        .filter(x -> !x.toLowerCase().contains("yy"))
                        .collect(Collectors.toList());
    }
}
