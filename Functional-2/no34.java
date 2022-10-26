package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class no34
{
    public List<String> no34(List<String> strings)
    {
        return
                strings.stream()
                        .filter(x -> x.length() != 4 && x.length() != 3)
                        .collect(Collectors.toList());

    }
}
