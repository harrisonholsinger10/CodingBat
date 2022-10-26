package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class noX
{
    public List<String> noX(List<String> strings)
    {
        return
                strings.stream()
                        .map(x -> x.replaceAll("[xX]", "")) // replaces upper and lowercase "x"
                        .collect(Collectors.toList());
    }
}
