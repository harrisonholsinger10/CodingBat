package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class noZ
{
    public List<String> noZ(List<String> strings)
    {
        return
                strings.stream()
                        .filter(x -> !x.contains("z") && !x.contains("Z")) // uppercase and lowercase "z"
                        .collect(Collectors.toList());

    }
}
