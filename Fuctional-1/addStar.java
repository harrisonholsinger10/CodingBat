package com.example.demo;

/*
* Given a list of strings, return a list where each string has "*" added at its end.
*/

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
